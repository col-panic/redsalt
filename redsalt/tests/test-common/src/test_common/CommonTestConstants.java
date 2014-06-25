package test_common;

import java.io.File;

public class CommonTestConstants {

	public static final String TEST_BASE = "../test-common/outputs/";
	public static final String XMI_EMPTY = TEST_BASE+"redsalt_empty.xmi";
	public static final String XMI_CA = TEST_BASE+"redsalt_ca.xmi";
	public static final String XMI_CAB = TEST_BASE+"redsalt_cab.xmi";
	
	public static final File XMI_EMPTY_FILE = new File(XMI_EMPTY);
	public static final File XMI_CA_FILE = new File(XMI_CA);
	public static final File XMI_CAB_FILE = new File(XMI_CAB);
}
