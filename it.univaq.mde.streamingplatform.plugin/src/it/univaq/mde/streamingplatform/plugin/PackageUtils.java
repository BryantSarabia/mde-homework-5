package it.univaq.mde.streamingplatform.plugin;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.common.util.URI;

import StreamingPlatform.StreamingPlatformPackage;

import java.io.IOException;
import java.util.Map;

public class PackageUtils {

    private static final ResourceSet resSet = new ResourceSetImpl();

    static {
        registerPackage();
    }

    public static void registerPackage() {
        EPackage.Registry.INSTANCE.put(StreamingPlatformPackage.eNS_URI, StreamingPlatformPackage.eINSTANCE);

        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
    }

    public static ResourceSet getSharedResourceSet() {
        return resSet;
    }

    public static <T extends EObject> T load(String fileName, Class<T> clazz) {
        ResourceSet resourceSet = getSharedResourceSet();
        Resource resource;

        try {
            resource = resourceSet.getResource(URI.createFileURI(fileName), true);

            if (resource.getContents().isEmpty()) {
                throw new RuntimeException("No content found in the XMI file: " + fileName);
            }

            EObject eObject = resource.getContents().get(0);
            if (!clazz.isInstance(eObject)) {
                throw new ClassCastException("The content of the file is not of type: " + clazz.getName());
            }

            return clazz.cast(eObject);
        } catch (ClassCastException e) {
            System.err.println("Error loading file: " + fileName);
            e.printStackTrace();
            return null;
        }
    }

    public static <T extends EObject> void serialize(T eObject, String fileName) {
        ResourceSet resourceSet = getSharedResourceSet();
        Resource resource = resourceSet.createResource(URI.createFileURI(fileName));

        resource.getContents().add(eObject);

        try {
            resource.save(null);
            System.out.println("Serialized " + eObject.getClass().getSimpleName() + " to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving file: " + fileName);
            e.printStackTrace();
        }
    }
}
