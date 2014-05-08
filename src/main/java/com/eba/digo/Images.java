package com.eba.digo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

/**
 * Created by m-ehrenberg on 4/30/2014.
 * 
 * @author Mike Ehrenberg
 *         <p/>
 *         <p/>
 *         https://developers.digitalocean.com/images/
 *         <p/>
 *         https://api.digitalocean.com/images/?client_id=[client_id]&api_key=[
 *         api_key]&filter=[filter]
 */
public class Images {

	@Expose
	private String status;
	@Expose
	private List<Image> images = new ArrayList<Image>();

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Boolean isValid() {

		if (getStatus() == null || getStatus().toUpperCase().equals("ERROR")) {
			return false;
		}

		return true;
	}

	public Image getById(Integer imageId) {

		if (imageId != null) {
			for (Image i : getImages()) {
				if (i.getId().compareTo(imageId) == 0) {
					return i;
				}
			}
		}

		return null;
	}

	public List<String> getDistrosForRegion(int regionId) {
		final List<String> results = new ArrayList<String>();

		for (Image i : getImages()) {
			if (results.indexOf(i.getDistribution()) == -1) {
				if (i.getRegions().contains(regionId)) {
					results.add(i.getDistribution());
				}
			}
		}

		return results;
	}

	public List<String> getDistros() {
		final List<String> results = new ArrayList<String>();

		for (Image i : getImages()) {
			if (results.indexOf(i.getDistribution()) == -1) {
				results.add(i.getDistribution());
			}
		}

		return results;
	}

	public List<Image> getVersionsForDistro(final String distro) {
		final List<Image> results = new ArrayList<Image>();

		for (Image i : getImages()) {
			if (i.getDistribution().equalsIgnoreCase(distro)) {
				results.add(i);
			}
		}

		return results;
	}

	public List<String> getVersionNamesForDistro(final String distro, final Integer regionId) {
		final List<String> results = new ArrayList<String>();

		for (Image i : getImages()) {
			if (i.getDistribution().equalsIgnoreCase(distro)) {
				if (regionId == null) {
					results.add(i.getName());
				} else if (i.getRegions().contains(regionId)) {
					results.add(i.getName());
				}
			}
		}

		return results;
	}

	public Image getImageByDistroAndName(final String distro, final String name) {
		for (Image i : getVersionsForDistro(distro)) {
			if (i.getName().equalsIgnoreCase(name)) {
				return i;
			}
		}
		return null;
	}
}
