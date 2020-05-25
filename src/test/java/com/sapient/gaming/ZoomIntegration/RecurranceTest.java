package ZoomIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import ZoomIntegration.model.Recurrence;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
@ContextConfiguration(classes=ZoomIntegrationApplication.class)
public class RecurranceTest {
	
	@Test
	public void checkSettersAndGetters() {
		Recurrence rec = new Recurrence();
		rec.setEnd_times(2);
		rec.setType("2");
		rec.setWeekly_days("2");
		assertEquals(2, rec.getEnd_times());
		assertEquals("2",rec.getType());
		assertEquals("2",rec.getWeekly_days());
	}
	
	@Test
	public void checkAllArgsConstructor() {
		Recurrence rec = new Recurrence("2", "2", 2);
		assertEquals(2, rec.getEnd_times());
		assertEquals("2",rec.getType());
		assertEquals("2",rec.getWeekly_days());
	}
	
	@Test
	public void checkToString() {
		Recurrence rec = new Recurrence();
		rec.setEnd_times(2);
		rec.setType("2");
		rec.setWeekly_days("2");
		String res = "Recurrence(type=" + rec.getType() + ", weekly_days=" + rec.getWeekly_days() + ", end_times=" + rec.getEnd_times() + ")";
		assertEquals(res, rec.toString());
	}
}
