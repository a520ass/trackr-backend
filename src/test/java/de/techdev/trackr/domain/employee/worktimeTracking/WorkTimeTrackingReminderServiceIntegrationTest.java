package de.techdev.trackr.domain.employee.worktimeTracking;

import de.techdev.trackr.IntegrationTest;
import de.techdev.trackr.core.mail.MailConfiguration;
import de.techdev.trackr.domain.ApiBeansConfiguration;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author Moritz Schulze
 */
@ContextConfiguration(classes = {ApiBeansConfiguration.class, MailConfiguration.class})
public class WorkTimeTrackingReminderServiceIntegrationTest extends IntegrationTest {

    @Autowired
    private WorkTimeTrackingReminderService workTimeTrackingReminderService;

    @Test
    public void remindEmployeesToTrackWorkTimes() throws Exception {
        workTimeTrackingReminderService.remindEmployeesToTrackWorkTimes();
    }
}
