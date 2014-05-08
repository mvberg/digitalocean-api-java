package com.eba.digo.api;


import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 5/5/2014.
 */
public class SSHKeys {

    @Expose
    private String status;

    @Expose
    private List<SSHKey> ssh_keys = new ArrayList<SSHKey>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SSHKey> getSsh_keys() {
        return ssh_keys;
    }

    public void setSsh_keys(List<SSHKey> ssh_keys) {
        this.ssh_keys = ssh_keys;
    }

    public void loadKey(Integer keyId, String pubKey) {
        for (final SSHKey key : getSsh_keys()) {
            if (keyId.compareTo(keyId) == 0) {
                key.setSsh_pub_key(pubKey);
            }
        }
    }


}
