package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"5.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.1780538303479458", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5723649429247", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.440892098500626E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1743961811521265E-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.433463893167966", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.652362892704858E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.975523373078884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-2.6190838401581408E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"57.15623566586292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("172.9833072602151", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"56.77623566586291"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("171.45051872458174", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"56.986235665862914"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("172.29727000008356", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-0.5828623566586291"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521265E-4", "-1.7976931348623157E308", "1.580887032249125E-4", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521268E-4", "4.7421875", "1.580887032249125E-4", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521268E-4", "47.421875", "1.580887032249125E-4", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"-2.1743961811521268E-5", "47.380875", "1.580887032249125E-4", "0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"8.441822398385275E-5", "-9.837447530487956E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.5", "-1.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.0", "4.7421875", "1.0", "-1"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.0", "47.380875", "1.0", "36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.6469603737272038E-21", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.0E-14", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.0", "0.9999999999999971", "-59.59796035547549", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.15623566586292", "57.15623566586292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5175912848188805", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.15623566586293", "57.15623566586292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5175912848188946", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"53.55623566586293", "57.15623566586292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7007759221920231", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"53.55623566586293", "57.10523566586292"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6984546321812268", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5378525034886164398", "2.0", "1.7976931348623157E308", "3"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.3785250348861645E18", "4.0", "-1.7976931348623157E308", "3"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.3785250348861645E19", "2.0", "-1.7976931348623157E308", "3"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"0.027683822593550178"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.5715495104484876", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.5", "2.1743961811521268E-4", "0.9999999999999971", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.01663768568548539", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.0", "2.1743961811521268E-4", "0.9999999999999971", "10"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1741597812163598E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.49999999999999994", "2.1743961811521268E-4", "0.9999999999999971", "522"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.01663768568548542", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.49999999999999994", "4.3487923623042535E-4", "0.9999999999999971", "522"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.02352753466692171", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.49999999999999994", "-4.3487923623042535E-4", "0.9999999999999971", "522"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.45100000000000007", "-32.00004205288835", "3.399464998481189E-5", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"9.837447530487956E-5", "4.7421875", "1.0E-14", "36"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"8.441822398385275E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.379678534031024", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"8.441822398385275E-6"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("11.682307475991822", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.688364479677055E-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.686482643531882", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"3.37672895935411E-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.993238078250975", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-3.0996623271040646"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.580887032249125E-4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.752263038932222", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-4.440892098500626E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"0.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5723649429247", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"-0.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"NaN", "4.7421875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.3785250348861635E18", "4.7421875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.6892625174430817E18", "4.7421875"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-2.689262517443082E19", "19.209749999999996"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.378525034886164E19", "1.4772999999999987"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-2.6190838401581408E-5", "1.4772999999999987"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.0", "2.9545999999999975"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20603266770037856", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.0", "2.9545999999999975"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.20603266770037856", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.0", "47.380875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2806225897124937E-19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.9999999999999998", "47.380875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2806225897124845E-19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.9999999999999998", "23.6904375"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2702889062947297E-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"4.7421875", "14.136097974741746"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9988192474848729", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.02097825603818848", "0.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9881307426824205", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.02097825603818848", "1.8000000000000003"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9986001751220087", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.23097825603818847", "1.8000000000000003"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9797521135790224", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"3.9309782560381885", "1.8000000000000003"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1164680988208753", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"3.9309782560381885", "6.5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8942947259397623", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"-4.348792362304254E-5", "-45.300000000000004"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.15623566586292", "47.380875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.908291789326628", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.15623566586292", "45.380875"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9489374805186989", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.15623566586292", "47.380875"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.908291789326628", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"5.3785250348861635E18", "8.441822398385275E-5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "0.0"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.3785250348861635E18", "0.9999999999999971"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"-1.0", "0.9999999999999971"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"-1.0", "14.136097974741746", "1.0", "0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"NaN", "-1.643181065367639E-4", "-1.7976931348623157E308", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"NaN", "-0.9999999999999999", "-0.1799841911296775", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"46.40175000000001", "1.075705006977233E19"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"57.15623566586292", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"3.399464998481189E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("10.289287777823304", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.0000000000000003E-14", "0.3530757947111655"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.999999999999994", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"-297.98780177737746", "NaN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.0E-14", "8.441822398385275E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.715250743307479E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.0E-14", "8.441822398385275E-5"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7408297026122455E-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"3.399464998481189E-5", "47.380875", "1.0", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999996", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"-1.0", "-9.837447530487956E-5", "5378525034886164398", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.999999999999997", "8.441822398385275E-5", "5.3785250348861645E17", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999155889021519", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.999999999999997", "1.6883644796770553E-4", "5.3785250348861645E17", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9998311920553722", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.999999999999997", "1.6883644796770553E-4", "5.3785250348861645E17", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9998311920553722", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"14.136097974741746", "1.6883644796770553E-4", "5.3785250348861645E17", "2147483589"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.15623566586292", "12.80019674895061"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("8.910665842034104E-20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"57.15623566586292", "15.30019674895061"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.074654541930463E-16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.5", "1.580887032249125E-4"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9858132605512746", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.0", "1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.632120558828558", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"53.502235665862926", "1.7976931348623157E308", "1.7976931348623157E308", "1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"2147483647", "280.32195949483497"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"47.380875", "28.032195949483498"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.334524420209653E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"23.6904375", "14.016097974741749"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.011357050149408507", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"2.3690437500000003", "14.016097974741749"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999725458912554", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.9668175000000001", "9.7206323548129", "0.9999577908880081", "36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.99973936997682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.9999999999999971", "1.580887032249125E-4", "2.1743961811521268E-4", "2"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5807620720592494E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"5.3785250348861645E17"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.1420707839822045E19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"5.3785250348861648E16"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.01822566830596224E18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"1.07570500697723296E17"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.1110135258819732E18", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.652362892704858E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.975523373078884", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.800046523628928"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.8813912400900197", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"8.441822398385275E-5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.379678534031024", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.6892625174430822E18", "-0.49191381609762025", "-35.720084418224005", "2147483646"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.344631258721542E16", "44.9421381609762", "35.720084418224005", "2"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521265E-4", "0.5", "1.0E-14", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9998782691755979", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521265E-4", "5.0", "2.0E-14", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999997501881431", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"0.5", "4.2209111991926375E-5", "1.0757050069772329E19", "36"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.007330605288607329", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"5.3785250348861635E18", "0.5", "8.441822398385275E-5", "10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"4.7421875"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.7972566643325765", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"7.0130489873708735", "1.1235582092889475E306", "4.600217439618116", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.0", "-1.643181065367639E-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"280.52195949483496", "1.1235582092889472E307", "1.0E-14", "536870985"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"6.724219594948348", "7.116619594948351", "6420.0", "32"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.6718684730385508", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"102.00750000000002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("368.38914682081065", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.3610869758472464", "22.761749999999992"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999995408098", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"3.399464998481189E-5", "1.580887032249125E-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.778786842416725E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"3.399464998481189E-5", "3.16177406449825E-4"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5432703063288375E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"14.136097974741746", "1.7976931348623157E308", "0.0", "36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"14.154097974741747", "47.380875", "0.0", "36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.28220483580221E-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"14.154097974741747", "47.380875", "0.0", "36"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.28220483580221E-9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "47.380875", "0.0", "36"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.53885504416587E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "47.380875", "0.0", "36"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.53885504416587E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "47.34587500000001", "0.0", "72"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.711035064943619E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "47.34587500000001", "4.0", "72"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.710935728986644E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "0.0", "3.967", "72"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"14.154097974741747", "0.014", "1.967", "-2147483648"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.7976931348623155E308", "1.0", "53.55623566586293", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"1.7976931348623155E308", "1.0", "53.52023566586293", "-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"23.6904375", "54.0045"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.242955542460347E-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"5378525034886164398", "1.7976931348623157E308", "NaN", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"53.77623566586292", "1.0757050069772329E19"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"26.88811783293146", "3.967"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.6213170491074517E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.3068811783293146", "31.033000000000005"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000002", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"9.476175000000001", "9.899999999999972", "57.15623566586292", "72"}, true);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.30931845858735646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"9.476175000000001", "9.899999999999972", "57.15623566586292", "144"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.30931845858735646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"18.952350000000003", "9.899999999999972", "114.31247133172585", "144"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9964806390976986", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.6190838401581408E-5", "53.55623566586293"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.7763568394002505E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836469999998E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.399670563389095E10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.147483647E8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.9051941723949614E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "logGamma", new String[]{"double"}, new String[]{"2.1474836469599998E8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.905194172318221E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"53.39796035547549", "2.689262517443082E19"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.4998356818934632", "4.799915581776017"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9980552294372211", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"14.136097974741746", "2.37109375"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7575541952613357E-7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"7.068048987370873", "2.37109375"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.010055851298976718", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.043989128019094235", "2.3710937499999996"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9986009920626658", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"1.1439891280190944", "2.3710937499999996"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8815632623176043", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.7976931348623158E307", "5378525034886164398", "-2.147483647E9", "72"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.MaxIterationsExceededException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.0871980905760632E-4", "14.04", "2.349999999999995", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999532169", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double"}, new String[]{"0.04308441822398386", "43.471"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000024", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.24999999999999997", "1.0", "0.47421875", "2147483646"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.08072712288199213", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.0E-14", "14.136097974741746", "7.0770489873708735", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0000000000000033", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"20.175", "69.55804898737088", "16.954097974741746", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999991208", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"1.0871980905760632E-5", "4.652362892704858E-5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0217389678712774E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.044348792362304254", "23.025"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.206013149930186E-13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.011087198090576062", "139.51100000000002"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.453592884421596E-14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"5.477048987370875", "17.438875000000007"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.5182964564266186E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.1104555995963187E-6", "0.552"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0579135770738546E-6", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.580887032249125E-4", "7.0770489873708735", "0.5", "30"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999741287916", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"29.000158088703223", "7.0770489873708735", "0.5", "30"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.2223447980891037E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"29.000158088703227", "7.0770489873708735", "0.5", "60"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.2223447980890727E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"1.580887032249125E-4", "14.154097974741749", "65.49382763219525", "72"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999983580384", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.7077048987370873", "1.580887032249125E-4", "4.6523628927048585E-5", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9977570698116596", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"53.55623566586293", "5378525034886164398"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"8.441822398385275E-5", "0.04197825603818848", "14.136097974741746", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.343595617779748E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"8.441822398385275E-5", "0.004197825603818848", "14.136097974741746", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.1359590636824706E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.5", "0.5", "3.399464998481189E-5", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.31731076142734527", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.001682115533792839", "266.64975406381177"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-9.103828801926284E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"59.99831788446621", "271.54975406381175"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.238851996994423E-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"59.99831788446621", "271.54875406381177"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.2421754762139906E-55", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"2.1743961811521268E-4", "14.136097974741745"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0476064460362977E-11", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.15617395169449216", "4.999999999999987"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.536031754882817E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double"}, new String[]{"0.1561739516944922", "40.28999999999989"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.1086244689504383E-15", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"20.99983568189346", "5.3785250348861635E18", "10.36999999999997", "16777252"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "3.967", "47.380875", "114"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.05526513365903589", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"7.0770489873708735", "7.934", "47.380875", "114"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7087653598331318", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"4.652362892704858E-5", "0.5", "1.7976931348623157E308", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.393472612714612", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"2.1743961811521268E-5", "4.348792362304254E-4", "2.0", "10"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5575465017092505E-4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaP", new String[]{"double", "double", "double", "int"}, new String[]{"53.55623566586293", "0.3967", "0.0", "262099"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.401074671322064E-93", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.special.Gamma", "org.apache.commons.math.special.Gamma", "regularizedGammaQ", new String[]{"double", "double", "double", "int"}, new String[]{"0.9999999999999971", "4.652362892704858E-5", "47.380875", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999534785354707", String.valueOf(actual));
 }
}
