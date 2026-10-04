package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}), new String[][]{{"hasNext", "", "1"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"19"}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "-2147483648"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=19, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}}, 1), new String[][]{{"next", "", "5"}, {"hasNext", "", "1"}, {"hasNext", "", "5"}, {"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, 0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 0] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, , null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, , null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=2147483647, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "1073741823"}}, 1);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=1073741823, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "1073741823"}}, 1), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-8171"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 11, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 2), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:3>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:11>"}}, 2), new String[][]{{"clone", "", "6"}, {"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"clone", "", "1"}, {"addAll", "java.util.Collection", "6"}, {"set", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 0, sample, , null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0, sample, , null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 3), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[, a, 0, sample, , null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:8>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a, , a, 0, null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<empty>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, 0, sample, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "10"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, null, null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, , null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, 0, sample, , null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, 0, sample, , null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, , null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:6>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<empty>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a, 0] {getElitismRate=0.0, getPopulationLimit=256, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("256", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=256, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1000", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=1000, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 10, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "-1"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"1"}, false, 11, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=1, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"1"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=1, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, null, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample, null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}), new String[][]{{"iterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}), new String[][]{{"iterator", "", "1"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, 0, sample, , null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 15, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a, null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:0>"}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a, 0, sample, , null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=6}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}), new String[][]{{"subList", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[, a, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[, a, ] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "16777206"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, ] {getElitismRate=0.0, getPopulationLimit=16777206, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[, a]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=2147483647, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=10, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3), new String[][]{{"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:9>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 1), new String[][]{{"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 12, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 12, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 3), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<null>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "0"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"8388627"}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "-2147483648"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=8388627, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 3), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=256, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, , a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, , a] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "-2147483648"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}}, 3), new String[][]{{"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, key] {getElitismRate=1.0, getPopulationLimit=2147483647, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, key, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, key, sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, key, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, key, sample, ] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 3), new String[][]{{"next", "", "0"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"containsAll", "java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=2147483647, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}}, 1), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-10"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"10"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=10, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, ] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, 0, sample, ] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NumberIsTooLargeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<empty>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "20"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomeList", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "-33554422"}}, 2), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "10"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=10, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "20"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=20, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "20"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=20, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "setPopulationLimit", "int", "20"}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=20, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a, null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 16, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=9, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "getChromosomeList", ""}}, 2), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosomes", new String[]{"java.util.Collection"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<empty>"}}, 1), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getFittestChromosome", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 2), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=32, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:9>"}, false, 14, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "iterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample, null] {getElitismRate=0.0, getPopulationLimit=16, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ListPopulation", "toString", ""}}, 1), new String[][]{{"hasNext", "", "5"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample] {getElitismRate=0.0, getPopulationLimit=8, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}, {"org.apache.commons.math3.genetics.ListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}, {"org.apache.commons.math3.genetics.ListPopulation", "addChromosomes", "java.util.Collection", "<sample:2>"}}, 1), new String[][]{{"next", "", "5"}, {"hasNext", "", "1"}, {"next", "", "5"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
}
