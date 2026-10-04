package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[null, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"remove", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=-2147483648, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-29"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"24"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=24, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=10, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"remove", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 2), new String[][]{{"contains", "java.lang.Object", "2"}, {"set", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"38"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=1.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<empty>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=NaN, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.0"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.0, getPopulationLimit=-2147483648, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<null>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"ensureCapacity", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"hasNext", "", "4"}, {"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getFittestChromosome", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:5>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-1073741804"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=-2147483647, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "NaN"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "Infinity"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=47, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483643"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=2147483643, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.8999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.8999999999999999, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=NaN, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=1, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getPopulationSize", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample, true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, true] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"63"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=63, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}), new String[][]{{"containsAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}), new String[][]{{"getPopulationLimit", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=NaN, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, , null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<empty>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"46"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-1.0000000000000002"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=46, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}}), new String[][]{{"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.5900000000000001"}}), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.5900000000000001, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}), new String[][]{{"getChromosomes", "", "3"}, {"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, a, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"clear", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2, a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "0"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "1"}}, 2), new String[][]{{"clear", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=1, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.8999999999999999"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "NaN"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-Infinity"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 1), new String[][]{{"listIterator", "", "3"}, {"previous", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=2147483647, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}), new String[][]{{"next", "", "6"}, {"hasNext", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"add", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=NaN, getPopulationLimit=-2147483648, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"4.9E-324"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "1.8"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=4.9E-324, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}}), new String[][]{{"hasNext", "", "2"}, {"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=-2147483648, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-1048574"}}), new String[][]{{"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=-1048574, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}), new String[][]{{"add", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, key] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"next", "", "3"}, {"next", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<empty>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}), new String[][]{{"iterator", "", "2"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=-2147483648, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "4.1000000000000005"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 3), new String[][]{{"add", "java.lang.Object", "7"}, {"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=true, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, true] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 1), new String[][]{{"clone", "", "0"}, {"isEmpty", "", "1"}, {"lastIndexOf", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, null, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=5}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "2147483639"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483639", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=-2147483648, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "1.7976931348623158E307"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 1), new String[][]{{"clear", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "[, a] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=5, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 1), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.OutOfRangeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}}, 3), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, a, 0] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"size", "", "3"}, {"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-2.0"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-26"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=-26, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.039"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=NaN, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:0>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, null, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, null, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getPopulationLimit", "", "0"}, {"getElitismRate", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.9000000000000001"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-0.9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.9000000000000001, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.9"}}), new String[][]{{"getElitismRate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.9, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1), new String[][]{{"iterator", "", "6"}, {"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"ensureCapacity", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-262143"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-262143", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, a, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample, null]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<empty>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, 0, sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getElitismRate", "", "2"}, {"getChromosomes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:1>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:5>"}}, 2), new String[][]{{"next", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample, null] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"-2147483647"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=-2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=1, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483622"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=-2147483622, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1), new String[][]{{"getPopulationSize", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 2), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, , ] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.9999999999999998"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9999999999999998", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=1, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-8.988465674311579E307"}}, 2), new String[][]{{"addAll", "int,java.util.Collection", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 1), new String[][]{{"getElitismRate", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 3), new String[][]{{"add", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2, a, 0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[2, a, 0, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=-2147483648, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "2.6"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0, sample, ]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", "org.apache.commons.math3.genetics.Chromosome", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, null, null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 1), new String[][]{{"setChromosomes", "java.util.List", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "-2147483648"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=-2147483648, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getFittestChromosome", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=NaN, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=-0.0, getPopulationLimit=1, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:2>"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0, sample, ]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "1"}}), new String[][]{{"getChromosomes", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=1, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.9"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.9, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:2>"}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, sample, ] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.0"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "0.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "4.9E-324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"0.0"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=0.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", new String[]{"java.util.List"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "iterator", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[, a] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "addChromosome", new String[]{"org.apache.commons.math3.genetics.Chromosome"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<empty>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[null] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", ""}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "2"}, {"add", "int,java.lang.Object", "3"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample, key, , a] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=4}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getPopulationSize", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 2), new String[][]{{"setChromosomes", "java.util.List", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.genetics.ElitisticListPopulation", actual.getClass().getName());
  assertEquals("[0] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "[0, a, sample] {getElitismRate=0.0, getPopulationLimit=3, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", new String[]{"double"}, new String[]{"1.0"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", new String[]{"int"}, new String[]{"67108863"}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "4.9E-324"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "[0] {getElitismRate=4.9E-324, getPopulationLimit=67108863, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationLimit", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getPopulationSize", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "[sample] {getElitismRate=0.0, getPopulationLimit=0, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[0]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[0] {getElitismRate=1.0, getPopulationLimit=4, getPopulationSize=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setPopulationLimit", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("[a, 0, sample]", String.valueOf(actual));
  assertEquals("receiver state after the call", "[a, 0, sample] {getElitismRate=0.0, getPopulationLimit=2147483647, getPopulationSize=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "nextGeneration", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "getChromosomes", ""}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setChromosomes", "java.util.List", "<sample:3>"}}, 2), new String[][]{{"getFittestChromosome", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.genetics.ElitisticListPopulation", "org.apache.commons.math3.genetics.ElitisticListPopulation", "getElitismRate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-0.0"}, {"org.apache.commons.math3.genetics.ElitisticListPopulation", "setElitismRate", "double", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
 }
}
