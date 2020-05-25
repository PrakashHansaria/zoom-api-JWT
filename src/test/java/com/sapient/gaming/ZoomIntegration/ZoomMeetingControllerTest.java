package ZoomIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.configuration.injection.MockInjection;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;

import ZoomIntegration.controller.ZoomMeetingController;
import ZoomIntegration.model.CreateZoomMeetingVO;
import ZoomIntegration.service.ZoomMeetingService;


@SpringBootTest
@RunWith(MockitoJUnitRunner.Silent.class)
@ContextConfiguration(classes = ZoomIntegrationApplication.class)
public class ZoomMeetingControllerTest {
	
	@Mock
	private ZoomMeetingService service;
	
	@InjectMocks
	private ZoomMeetingController controller;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	
	
	@Test
	public void testCreateMeetingFailure() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		String res = "meeting";
		Mockito.when(service.createMeeting(mockMeeting, res)).thenReturn(null);
		assertEquals(null, controller.createMeeting(mockMeeting,res));
	}
	
	@Test
	public void testUpdateMeetingSuccess() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		Mockito.when(service.updateMeeting(mockMeeting, "test")).thenReturn(HttpStatus.OK);
		assertEquals(HttpStatus.OK, controller.updateMeeting(mockMeeting,"test"));
	}
	
	@Test
	public void testUpdateMeetingFailure() {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		Mockito.when(service.updateMeeting(mockMeeting, "test")).thenReturn(HttpStatus.NOT_FOUND);
		assertEquals(HttpStatus.NOT_FOUND, controller.updateMeeting(mockMeeting,"test"));
	}
	
	@Test
	public void testDeleteMeetingSuccess() {
		Mockito.when(service.deleteMeeting("test")).thenReturn(HttpStatus.OK);
		assertEquals(HttpStatus.OK, controller.deleteMeeting("test"));
	}
	
	@Test
	public void testDeleteMeetingFaliure() {
		Mockito.when(service.deleteMeeting("test")).thenReturn(HttpStatus.OK);
		assertEquals(HttpStatus.OK, controller.deleteMeeting("test"));
	}

}
