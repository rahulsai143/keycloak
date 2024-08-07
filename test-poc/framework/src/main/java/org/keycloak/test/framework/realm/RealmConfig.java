package org.keycloak.test.framework.realm;

import org.keycloak.representations.idm.RealmRepresentation;

public interface RealmConfig {

    RealmRepresentation getRepresentation();

    default RealmConfigBuilder builder() {
        return new RealmConfigBuilder();
    }

}
