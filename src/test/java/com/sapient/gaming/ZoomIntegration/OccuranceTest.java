package ZoomIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ZoomIntegration.model.Occurance;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes=ZoomIntegrationApplication.class)
public class OccuranceTest {
	
	@Test
	public void checkSettersAndGetters() {
		Occurance occ =  new Occurance();
		occ.setDuration(30);
		occ.setOccurrence_id("1234");
		occ.setStart_time("2020");
		occ.setStatus("abcd");
		assertEquals(30, occ.getDuration());
		assertEquals("1234", occ.getOccurrence_id());
		assertEquals("2020", occ.getStart_time());
		assertEquals("abcd", occ.getStatus());
	}

	@Test
	public void checkAllArgsConstuctor() {
		Occurance occ = new Occurance(30, "2020", "1234", "abcd");
		assertEquals(30, occ.getDuration());
		assertEquals("1234", occ.getOccurrence_id());
		assertEquals("2020", occ.getStart_time());
		assertEquals("abcd", occ.getStatus());
	}
	
	@Test
	public void checkToString() {
		Occurance occ =  new Occurance();
		occ.setDuration(30);
		occ.setOccurrence_id("1234");
		occ.setStart_time("2020");
		occ.setStatus("abcd");
		String result = "Occurance(duration=" + occ.getDuration() + ", start_time=" + occ.getStart_time() + ", occurrence_id=" + occ.getOccurrence_id()
				+ ", status=" + occ.getStatus() + ")";
		assertEquals(result, occ.toString());
	}
}
