package com.eba.digo.api;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m-ehrenberg on 4/29/2014.
 */
public class Droplets {

	@Expose
	private String status;

	@Expose
	private List<Droplet> droplets = new ArrayList<Droplet>();

	private Sizes sizes;

	private Regions regions;

	private Images images;

	public List<Droplet> getDroplets() {
		return droplets;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Droplet getById(Integer dropletId) {

		if (dropletId != null) {
			for (Droplet d : getDroplets()) {
				if (d.getId().compareTo(dropletId) == 0) {
					return d;
				}
			}
		}

		return null;
	}

	public Droplet getByName(String dropletName) {

		if (dropletName != null) {
			for (Droplet d : getDroplets()) {
				if (d.getName().equalsIgnoreCase(dropletName)) {
					return d;
				}
			}
		}

		return null;
	}

	public boolean isValid() {

		if (getStatus() == null || getStatus().equalsIgnoreCase("ERROR")) {
			return false;
		}

		return true;
	}

	public void refresh(final Droplets newData) {

		if (newData == null || !newData.isValid()) {
			return;
		}

		setExtras(newData.getSizes(), newData.getRegions(), newData.getImages());

		setStatus(newData.getStatus());

		getDroplets().clear();

		getDroplets().addAll(newData.getDroplets());
	}

	public void setExtras(Sizes sizes, Regions regions, Images images) {
		if (sizes != null) {
			this.sizes = sizes;
		}
		if (regions != null) {
			this.regions = regions;
		}
		if (images != null) {
			this.images = images;
		}
	}

	public Sizes getSizes() {
		return this.sizes;
	}

	public Regions getRegions() {
		return this.regions;
	}

	public Images getImages() {
		return this.images;
	}
}
