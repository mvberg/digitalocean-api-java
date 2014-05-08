package com.eba.digo;

import com.google.gson.annotations.Expose;

/**
 * Created by Mike on 5/5/2014.
 */
public class SSHKey {

    @Expose
    private Integer id;

    @Expose
    private String name;

    @Expose
    private String ssh_pub_key;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsh_pub_key() {
        return ssh_pub_key;
    }

    public void setSsh_pub_key(String ssh_pub_key) {
        this.ssh_pub_key = ssh_pub_key;
    }
}
