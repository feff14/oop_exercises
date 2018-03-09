package ch.hslu.sw07;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

import java.util.Objects;

import static org.junit.Assert.*;

public class ElementTest {
    @Test
    public void equals() throws Exception {
        Pb pb = new Pb(30f);
        N n = new N(30f);
        assertEquals(false, pb.equals(n));
    }

    @Test
    public void compareHaschCode() throws Exception {
        Pb pb = new Pb(30f);
        Pb pb2 = new Pb(30f);
        assertEquals(true, Objects.equals(pb.hashCode(),pb2.hashCode()));
    }

    @Test
    public void equalsVerify()
    {
        EqualsVerifier.forClass(Element.class).suppress(Warning.ALL_FIELDS_SHOULD_BE_USED, Warning.NULL_FIELDS, Warning.NONFINAL_FIELDS).verify();
    }
}