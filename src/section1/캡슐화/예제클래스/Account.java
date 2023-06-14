package section1.캡슐화.예제클래스;

import java.util.Date;

import static java.time.Instant.now;

public class Account {
    private Membership membership;
    private Date expDate;

    private Membership REGULAR;

    public boolean hasRegularPermission() {
        return membership == REGULAR && expDate.toInstant().isAfter(now());
    }
}
