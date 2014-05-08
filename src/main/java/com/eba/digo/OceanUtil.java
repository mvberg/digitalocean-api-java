package com.eba.digo;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.google.gson.Gson;

/**
 * Created by m-ehrenberg on 4/30/2014.
 */
public class OceanUtil {

	public static NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public static final String NEW_LINE = System.getProperty("line.separator");

	private static final CommandResponse defaultErrorResponse = new CommandResponse();

	public static final SimpleDateFormat FILE_FORMAT = new SimpleDateFormat("MM_dd_yy_HH_mm", Locale.US);

	private static final Gson GSON = new Gson();

	static {
		formatter.setMaximumFractionDigits(5);
		defaultErrorResponse.setStatus("ERROR");
		defaultErrorResponse.setEvent_id(-1);
	}

	public static String toJson(Object o) {
		return GSON.toJson(o);
	}

	public static CommandResponse getErrorCommandResponse() {
		return defaultErrorResponse;
	}

	public static String getCommandName(final String commandId) {
		if (commandId.equalsIgnoreCase("new")) {
			return getPresentEventTypeName(1);
		} else if (commandId.equalsIgnoreCase("rename")) {
			return getPresentEventTypeName(6);
		} else if (commandId.equalsIgnoreCase("power_cycle")) {
			return getPresentEventTypeName(5);
		} else if (commandId.equalsIgnoreCase("power_off")) {
			return getPresentEventTypeName(19);
		} else if (commandId.equalsIgnoreCase("power_on")) {
			return getPresentEventTypeName(18);
		} else if (commandId.equalsIgnoreCase("destroy")) {
			return getPresentEventTypeName(10);
		} else if (commandId.equalsIgnoreCase("snapshot")) {
			return getPresentEventTypeName(8);
		} else if (commandId.equalsIgnoreCase("restore")) {
			return getPresentEventTypeName(17);
		} else if (commandId.equalsIgnoreCase("reboot")) {
			return getPresentEventTypeName(4);
		} else if (commandId.equalsIgnoreCase("password_reset")) {
			return getPresentEventTypeName(24);
		} else if (commandId.equalsIgnoreCase("ssh_keys_destroy")) {
			return getPresentEventTypeName(100);
		} else if (commandId.equalsIgnoreCase("ssh_keys_edit")) {
			return getPresentEventTypeName(101);
		} else if (commandId.equalsIgnoreCase("ssh_keys_new")) {
			return getPresentEventTypeName(102);
		} else {
			return commandId;
		}
	}

	public static int getCommandTypeId(final String commandName) {
		if (commandName.equalsIgnoreCase("new")) {
			return 1;
		} else if (commandName.equalsIgnoreCase("power_cycle")) {
			return 5;
		} else if (commandName.equalsIgnoreCase("rename")) {
			return 6;
		} else if (commandName.equalsIgnoreCase("power_off")) {
			return 19;
		} else if (commandName.equalsIgnoreCase("power_on")) {
			return 18;
		} else if (commandName.equalsIgnoreCase("snapshot")) {
			return 8;
		} else if (commandName.equalsIgnoreCase("restore")) {
			return 17;
		} else if (commandName.equalsIgnoreCase("destroy")) {
			return 10;
		} else if (commandName.equalsIgnoreCase("reboot")) {
			return 4;
		} else if (commandName.equalsIgnoreCase("password_reset")) {
			return 24;
		} else if (commandName.equalsIgnoreCase("ssh_keys_destroy")) {
			return 100;
		} else if (commandName.equalsIgnoreCase("ssh_keys_edit")) {
			return 101;
		} else if (commandName.equalsIgnoreCase("ssh_keys_new")) {
			return 102;
		} else {
			return -1;
		}
	}

	public static Event getDefaultCompleteEvent(int droplet, int eventTypeId) {

		final Event e = new Event();

		e.setAction_status("done");
		e.setId(-1);
		e.setPercentage("100");
		e.setDroplet_id(droplet);
		e.setEvent_type_id(eventTypeId);

		return e;
	}

	public static String getEventTypeName(int id) {
		switch (id) {
		case 1:
			return "Create Droplet";
		case 4:
			return "Reboot";
		case 6:
			return "Rename";
		case 8:
			return "Create Snapshot";
		case 10:
			return "Destroy Droplet";
		case 18:
			return "Power On";
		case 19:
			return "Power Down";
		case 24:
			return "Password Reset";
		default:
			return "Unknown";
		}
	}

	public static String getPresentEventTypeName(int id) {
		switch (id) {
		case 1:
			return "Creating droplet...";
		case 4:
			return "Rebooting...";
		case 5:
			return "Cycling power...";
		case 6:
			return "Renaming...";
		case 8:
			return "Snapshotting...";
		case 10:
			return "Destroying...";
		case 18:
			return "Powering up...";
		case 17:
			return "Restoring...";
		case 19:
			return "Powering down...";
		case 24:
			return "Resetting pass...";
		case 100:
			return "Deleting key...";
		case 101:
			return "Saving key...";
		case 102:
			return "Creating key...";
		default:
			return "Unknown";
		}
	}

	public static String getSizeString(Droplet droplet, Droplets droplets) {

		String size = "";

		if (droplets.getSizes() != null) {
			final Size sz = droplet.getSize(droplets.getSizes());
			size = sz.getName() + " (" + sz.getDisk() + "GB HD) " + sz.getCpu() + " CPU";
		}

		return size;
	}

	public static String getLockedString(Boolean locked) {
		if (locked) {
			return "Yep!";
		} else {
			return "Nope";
		}
	}

	public static String getCostValue(Double number) {

		return formatter.format(number);
	}

	public static String getStatusString(String dropletStatus) {
		if (dropletStatus == null) {
			return "Unknown";
		} else if (dropletStatus.equalsIgnoreCase("active")) {
			return "Online";
		} else if (dropletStatus.equalsIgnoreCase("off")) {
			return "Offline";
		} else if (dropletStatus.equalsIgnoreCase("new")) {
			return "Creating";
		} else {
			return dropletStatus;
		}
	}

	public static boolean isDropletOn(final Droplet droplet) {
		if (droplet.getStatus().equalsIgnoreCase("active")) {
			return true;
		}

		return false;
	}

	public static String getNewSnapshotName(final Droplet droplet) {

		return droplet.getName() + "_snap_" + FILE_FORMAT.format(new Date());

	}

}
