package it.univaq.mde.streamingplatform.plugin;

import java.util.Date;
import java.util.UUID;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import StreamingPlatform.StreamingPlatformFactory;
import StreamingPlatform.User;
import StreamingPlatform.Role;

public class UserUtils {
    public static User create(String name, Role role, String avatar, boolean isOnline, String nickname,
            String description) {
        User user = StreamingPlatformFactory.eINSTANCE.createUser();
        user.setUserID(UUID.randomUUID().toString());
        user.setName(name);
        user.setRole(role);
        user.setAvatar(avatar);
        user.setIsOnline(isOnline);
        user.setNickname(nickname);
        user.setDescription(description);
        user.setCreatedAt(new Date());
        return user;
    }

    public static Diagnostic validate(User user) {
        return Diagnostician.INSTANCE.validate(user);
    }

}
