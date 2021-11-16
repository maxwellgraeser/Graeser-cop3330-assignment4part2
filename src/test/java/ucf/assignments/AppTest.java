package ucf.assignments;

import static org.junit.jupiter.api.Assertions.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void itemTest() {
        Item tester = new Item();
        assertEquals("No Date", tester.getDate());
        assertEquals("No Title", tester.getTitle());
        assertEquals(false, tester.getComplete());
    }

    @Test
    void controllerTest() {
        // note: overList refers to the overarching list of lists
        // addList() assert list name in overList is the same
        // removeList assert name in overList no longer exists
        // editLstTitle() assert new name is in overList
        // addItem() assert that item is in a predetermined list
        // removeItem() assert that item is no longer in the predetermined list
    }
}
