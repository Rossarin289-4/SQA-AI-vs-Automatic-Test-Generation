package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class FastDateFormatSerializationTest {

    @Test
    public void testSerializationRoundTripFormat() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
        
        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();
        byte[] bytes = baos.toByteArray();
        
        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        
        // Verify formatting works post-deserialization
        Date date = new Date(0L); // 1970-01-01 00:00:00 UTC (depending on TZ)
        String formatted = deserialized.format(date);
        assertNotNull("Formatted string should not be null", formatted);
    }

    @Test
    public void testSerializationWithTimeZoneAndLocale() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance(
            "Z yyyy/MM/dd", TimeZone.getTimeZone("GMT+2"), Locale.GERMAN
        );
        
        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();
        byte[] bytes = baos.toByteArray();
        
        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        
        // Verify formatting works post-deserialization
        String formatted = deserialized.format(new Date(1000000000L));
        assertNotNull("Formatted string with timezone/locale should not be null", formatted);
    }

    @Test
    public void testToStringAfterDeserialization() throws Exception {
        FastDateFormat original = FastDateFormat.getInstance("HH:mm:ss.SSS");
        
        // Serialize
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(original);
        oos.flush();
        byte[] bytes = baos.toByteArray();
        
        // Deserialize
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        FastDateFormat deserialized = (FastDateFormat) ois.readObject();
        
        // Verify toString or formatting does not throw NullPointerException due to null mRules
        assertNotNull(deserialized.toString());
        assertNotNull(deserialized.format(new Date()));
    }
}
