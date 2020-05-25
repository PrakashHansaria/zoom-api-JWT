package ZoomIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ZoomIntegration.model.CreateZoomMeetingVO;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes=ZoomIntegrationApplication.class)
public class CreateZoomMeetingVOTest {
	
	@Test
	public void checkSettersAndGetters() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		assertEquals("Test", mockMeeting.getTopic());
		assertEquals(2, mockMeeting.getType());
		assertEquals("2020-05-07", mockMeeting.getStart_time());
		assertEquals(30, mockMeeting.getDuration());
		assertEquals("Asia/Kolkata", mockMeeting.getTimezone());
		assertEquals("Testing with Junit", mockMeeting.getAgenda());
	}
	
	@Test
	public void checkAllArgsConstructor() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO("Test", 2, "2020-05-07", 30, "Asia/Kolkata", "Testing with Junit");
		assertEquals("Test", mockMeeting.getTopic());
		assertEquals(2, mockMeeting.getType());
		assertEquals("2020-05-07", mockMeeting.getStart_time());
		assertEquals(30, mockMeeting.getDuration());
		assertEquals("Asia/Kolkata", mockMeeting.getTimezone());
		assertEquals("Testing with Junit", mockMeeting.getAgenda());
	}
	
	@Test
	public void toStringCheck() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		String result = "CreateZoomMeetingVO(topic=" + mockMeeting.getTopic() + ", type=" + mockMeeting.getType() + ", start_time=" + mockMeeting.getStart_time() + ", duration="
				+ mockMeeting.getDuration() + ", timezone=" + mockMeeting.getTimezone() + ", agenda=" + mockMeeting.getAgenda() + ")";
		assertEquals(mockMeeting.toString(),result);
	}
	

}
