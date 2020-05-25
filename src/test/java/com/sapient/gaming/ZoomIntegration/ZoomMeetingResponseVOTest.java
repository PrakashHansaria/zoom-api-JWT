package ZoomIntegration;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ZoomIntegration.model.CreateZoomMeetingVO;
import ZoomIntegration.model.Occurance;
import ZoomIntegration.model.Recurrence;
import ZoomIntegration.model.ZoomMeetingResponseVO;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes=ZoomIntegrationApplication.class)
public class ZoomMeetingResponseVOTest {
	
	@Test
	public void checkGettersAndGetters() {
		ZoomMeetingResponseVO mockRes = new ZoomMeetingResponseVO();
		Occurance occ = new Occurance(30, "2020", "12345", "active");
		ArrayList<Occurance> occs = new ArrayList<Occurance>();
		Recurrence rec = new Recurrence("2", "2", 2);
		occs.add(occ);
		mockRes.setOccurrences(occs);
		mockRes.setAgenda("abcd");
		mockRes.setCreated_at("2020");
		mockRes.setDuration(30);
		mockRes.setHost_id("1234");
		mockRes.setId(1234567L);
		mockRes.setJoin_url("abcd.com");
		mockRes.setStart_time("2020");
		mockRes.setStart_url("abcd.com");
		mockRes.setRecurrence(rec);
		mockRes.setTimezone("Asia");
		mockRes.setTopic("abcd");
		mockRes.setType(1);
		mockRes.setUuid("12345sc");
		assertEquals(occs,mockRes.getOccurrences());
		assertEquals("abcd",mockRes.getAgenda());
		assertEquals("2020",mockRes.getCreated_at());
		assertEquals(30,mockRes.getDuration());
		assertEquals("1234",mockRes.getHost_id());
		assertEquals(1234567L,mockRes.getId());
		assertEquals("abcd.com",mockRes.getJoin_url());
		assertEquals("2020",mockRes.getStart_time());
		assertEquals("abcd.com",mockRes.getStart_url());
		assertEquals(rec,mockRes.getRecurrence());
		assertEquals("Asia",mockRes.getTimezone());
		assertEquals("abcd",mockRes.getTopic());
		assertEquals(1,mockRes.getType());
		assertEquals("12345sc", mockRes.getUuid());	
	}
	
	
	@Test
	public void checkAllArgsConstructor() {
		Occurance occ = new Occurance(30, "2020", "12345", "active");
		ArrayList<Occurance> occs = new ArrayList<Occurance>();
		Recurrence rec = new Recurrence("2", "2", 2);
		occs.add(occ);
		ZoomMeetingResponseVO mockRes = new ZoomMeetingResponseVO(occs, rec, "abcd.com", "Asia", "abcd.com", "2020", 1, "12345sc", "abcd", "1234", 30, "2020", "abcd", 1234567L);
		assertEquals(occs,mockRes.getOccurrences());
		assertEquals("abcd",mockRes.getAgenda());
		assertEquals("2020",mockRes.getCreated_at());
		assertEquals(30,mockRes.getDuration());
		assertEquals("1234",mockRes.getHost_id());
		assertEquals(1234567L,mockRes.getId());
		assertEquals("abcd.com",mockRes.getJoin_url());
		assertEquals("2020",mockRes.getStart_time());
		assertEquals("abcd.com",mockRes.getStart_url());
		assertEquals(rec,mockRes.getRecurrence());
		assertEquals("Asia",mockRes.getTimezone());
		assertEquals("abcd",mockRes.getTopic());
		assertEquals(1,mockRes.getType());
		assertEquals("12345sc", mockRes.getUuid());	
	}
	
	@Test
	public void checkTString() {
		ZoomMeetingResponseVO mockRes = new ZoomMeetingResponseVO();
		Occurance occ = new Occurance(30, "2020", "12345", "active");
		ArrayList<Occurance> occs = new ArrayList<Occurance>();
		Recurrence rec = new Recurrence("2", "2", 2);
		occs.add(occ);
		mockRes.setOccurrences(occs);
		mockRes.setAgenda("abcd");
		mockRes.setCreated_at("2020");
		mockRes.setDuration(30);
		mockRes.setHost_id("1234");
		mockRes.setId(1234567L);
		mockRes.setJoin_url("abcd.com");
		mockRes.setStart_time("2020");
		mockRes.setStart_url("abcd.com");
		mockRes.setRecurrence(rec);
		mockRes.setTimezone("Asia");
		mockRes.setTopic("abcd");
		mockRes.setType(1);
		mockRes.setUuid("12345sc");
		String result = "ZoomMeetingResponseVO(occurrences=" + mockRes.getOccurrences() + ", recurrence=" + mockRes.getRecurrence() + ", join_url="
				+ mockRes.getJoin_url() + ", timezone=" + mockRes.getTimezone() + ", start_url=" + mockRes.getStart_url() + ", created_at=" + mockRes.getCreated_at()
				+ ", type=" + mockRes.getType() + ", uuid=" + mockRes.getUuid() + ", agenda=" + mockRes.getAgenda() + ", host_id=" + mockRes.getHost_id() + ", duration="
				+ mockRes.getDuration() + ", start_time=" + mockRes.getStart_time() + ", topic=" + mockRes.getTopic() + ", id=" + mockRes.getId() + ")";
		assertEquals(result, mockRes.toString());
	}
}
