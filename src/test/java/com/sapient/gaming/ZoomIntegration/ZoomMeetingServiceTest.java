package ZoomIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.net.URISyntaxException;

import static org.mockito.ArgumentMatchers.any;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import ZoomIntegration.model.CreateZoomMeetingVO;
import ZoomIntegration.model.ZoomMeetingResponseVO;
import ZoomIntegration.service.ZoomMeetingService;

@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ZoomIntegrationApplication.class)
public class ZoomMeetingServiceTest {

//	@Mock(answer = Answers.RETURNS_DEEP_STUBS)
	@MockBean
	private RestTemplate restTemplate;

	@Autowired
	private ZoomMeetingService service;


//	@BeforeEach
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}

	@Test
	public void checkCreateMeeting() throws URISyntaxException {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		String joinUrl = "meeting url";

		ZoomMeetingResponseVO responseEntity = new ZoomMeetingResponseVO();
		responseEntity.setJoin_url(joinUrl);
		ResponseEntity<ZoomMeetingResponseVO> res = new ResponseEntity(responseEntity,HttpStatus.OK);
		Mockito.when(restTemplate.exchange(
				any(), 
				any(),
				any(),
				any(Class.class))).thenReturn(res);
		assertEquals(joinUrl, service.createMeeting(mockMeeting,"abcd"));
	}

	@Test
	public void checkUpdateMeeting() throws URISyntaxException {
		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
		mockMeeting.setTopic("Test");
		mockMeeting.setType(2);
		mockMeeting.setStart_time("2020-05-07");
		mockMeeting.setDuration(30);
		mockMeeting.setTimezone("Asia/Kolkata");
		mockMeeting.setAgenda("Testing with Junit");
		String joinUrl = "meeting url";

		ZoomMeetingResponseVO responseEntity = new ZoomMeetingResponseVO();
		responseEntity.setJoin_url(joinUrl);
		ResponseEntity<ZoomMeetingResponseVO> res = new ResponseEntity(responseEntity,HttpStatus.OK);
		
		Mockito.when(restTemplate.exchange(
				any(), 
				any(),
				any(),
				any(Class.class))).thenReturn(res);
		assertEquals(HttpStatus.OK, service.updateMeeting(mockMeeting,"prakashh.510@gmail.com"));
	}
	
	@Test
	public void checkDeleteMeeting() throws URISyntaxException {
//		CreateZoomMeetingVO mockMeeting = new CreateZoomMeetingVO();
//		mockMeeting.setTopic("Test");
//		mockMeeting.setType(2);
//		mockMeeting.setStart_time("2020-05-07");
//		mockMeeting.setDuration(30);
//		mockMeeting.setTimezone("Asia/Kolkata");
//		mockMeeting.setAgenda("Testing with Junit");
		String joinUrl = "meeting url";
//
		ZoomMeetingResponseVO responseEntity = new ZoomMeetingResponseVO();
		responseEntity.setJoin_url(joinUrl);
		ResponseEntity<ZoomMeetingResponseVO> res = new ResponseEntity(responseEntity,HttpStatus.OK);
//		
		Mockito.when(restTemplate.exchange(
				any(), 
				any(),
				any(),
				any(Class.class))).thenReturn(res);
		assertEquals(HttpStatus.OK, service.deleteMeeting("abcd"));
	}












}
