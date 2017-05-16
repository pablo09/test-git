package com.pzeszko.test;

import com.pzeszko.optional8.FakeEntity;
import com.pzeszko.optional8.FakeService;
import com.pzeszko.optional8.NotFoundException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Admin on 16.05.2017.
 */

public class OptionalTests {

    private FakeService fakeService = new FakeService();

    @Test
    public void testOptional() {
        FakeEntity entity = fakeService.findEntity(1L);

        assertEquals(1L, (long) entity.getId());
        assertEquals("Fruits", entity.getName());
    }

    @Test(expected = NotFoundException.class)
    public void shouldThrowNotFoundException() {
       fakeService.findEntity(3L);
    }
}
