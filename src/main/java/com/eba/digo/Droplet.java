
package com.eba.digo;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;


public class Droplet {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private Integer image_id;
    @Expose
    private Integer size_id;
    @Expose
    private Integer region_id;
    @Expose
    private Boolean backups_active;
    @Expose
    private String ip_address;
    @Expose
    private Object private_ip_address;
    @Expose
    private Boolean locked;
    @Expose
    private String status;
    @Expose
    private String created_at;

    private final List<Snapshot> snapshots = new ArrayList<Snapshot>();

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

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer image_id) {
        this.image_id = image_id;
    }

    public Integer getSize_id() {
        return size_id;
    }

    public void setSize_id(Integer size_id) {
        this.size_id = size_id;
    }

    public Integer getRegion_id() {
        return region_id;
    }

    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    public Boolean getBackups_active() {
        return backups_active;
    }

    public void setBackups_active(Boolean backups_active) {
        this.backups_active = backups_active;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }

    public Object getPrivate_ip_address() {
        return private_ip_address;
    }

    public void setPrivate_ip_address(Object private_ip_address) {
        this.private_ip_address = private_ip_address;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Region getRegion(Regions regions) {
        if (regions == null) {
            return null;
        }

        for (Region r : regions.getRegions()) {
            if (r.getId() == getRegion_id()) {
                return r;
            }
        }

        return null;
    }

    public Size getSize(Sizes sizes) {
        if (sizes == null) {
            return null;
        }

        for (Size s : sizes.getSizes()) {
            if (s.getId() == getSize_id()) {
                return s;
            }
        }

        return null;
    }

    public void setSnapshots(final List<Snapshot> snaps) {
        if (snaps == null) {
            return;
        }

        snapshots.clear();
        snapshots.addAll(snaps);
    }

    public List<Snapshot> getSnapshots() {
        return snapshots;
    }
}
