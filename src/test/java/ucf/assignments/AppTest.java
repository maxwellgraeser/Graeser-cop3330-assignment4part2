package ucf.assignments;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void itemTest() {
        Item tester = new Item();
        assertEquals("No Date", tester.getDate());
        assertEquals("No Title", tester.getTitle());
    }

    @Test
    void controllerTest() {
        // note: overList refers to the overarching list of lists
        Controller tester = new Controller();

        // addList() assert list name in overList is the same
        // removeList assert name in overList no longer exists
        // editLstTitle() assert new name is in overList
        // addItem() assert that item is in a predetermined list
        // removeItem() assert that item is no longer in the predetermined list
        // displayList() assert every item's display is true
        // displayIncomplete() assert every item that is incomplete is set to display
        // displayComplete() assert every item that is complete is set to display
        // exportList() assert a file was created of the lists name
        // importList() assert a list exists in overList of name filename
        // cSetDate() assert the item's date is equal to new date
        // cSetTitle() assert the item's title is equal to new title
        // cSetComplete() assert the item's completion is updated
    }
}
