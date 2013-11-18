/**
 * 
 */
package edu.hawaii.ics414.icalendar.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import edu.hawaii.ics414.icalendar.DisplayMessageActivity;

/**
 * @author TC
 *
 */
public class DisplayMessageActivityTest extends ActivityInstrumentationTestCase2<DisplayMessageActivity> {

	private DisplayMessageActivity mActivity;    
	private TextView mView;    
	private String resourceString;
	
	/**
	 * @param name
	 */
	@SuppressWarnings("deprecation")
	public DisplayMessageActivityTest(String name) {
		super("edu.hawaii.ics414.icalendar", DisplayMessageActivity.class);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = this.getActivity();        
		mView = (TextView) mActivity.findViewById(edu.hawaii.ics414.icalendar.R.id.message);
		resourceString = mActivity.getString(edu.hawaii.ics414.icalendar.R.string.hello_world);
	}

	/* (non-Javadoc)
	 * @see android.test.ActivityInstrumentationTestCase2#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPreconditions() {
		assertNotNull(mView);
	}
	
	public void testText() {
		assertEquals(resourceString,(String)mView.getText());
	}

}
