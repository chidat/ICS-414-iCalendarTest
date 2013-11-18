/**
 * 
 */
package edu.hawaii.ics414.icalendar.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TimePicker;
import edu.hawaii.ics414.icalendar.TimePickerActivity;

/**
 * @author TC
 *
 */
public class TimePickerActivityTest extends ActivityInstrumentationTestCase2<TimePickerActivity> {

	private TimePickerActivity testActivity;
	private TimePicker testPicker;
	
	/**
	 * @param name
	 */
	@SuppressWarnings("deprecation")
	public TimePickerActivityTest(String name) {
		super("edu.hawaii.ics414.icalendar", TimePickerActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		setActivityInitialTouchMode(false);
		testActivity = getActivity();
		testPicker = (TimePicker) testActivity.findViewById(edu.hawaii.ics414.icalendar.R.id.timePicker);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link edu.hawaii.ics414.icalendar.TimePickerActivity#convertTime(int, int)}.
	 */
	public void testConvertTime() {
		int testHour = 1;
		int testMinute = 0;
		
		assertTrue("Unexpected implementation of convertTime().", "1:00AM".equals(testActivity.convertTime(testHour, testMinute)));
	}

}
