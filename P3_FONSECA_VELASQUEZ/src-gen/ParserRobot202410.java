// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/ParserRobot202410.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class ParserRobot202410 {
  public static Object toSet(Object C) {
    int $line=0;
    Object $result=null;
    $try:try {
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object x:GCollections.unmodifiableCollection(C)) {
        $v1.add(x);
      }
      $result=$v1;
      if (true) break $try;
      $line=3;
      $rethrow(new RuntimeException("The function \"toSet(C:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ParserRobot202410.class,"toSet",$line);
    }
    return $result;
  }
  public static IPushdownAutomaton createParser(Object A) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=8;
      Object Q=$fix($opIntvlY($opMinusY(2),15));
      $line=9;
      Object \u03A3=$fix($opUnionY(ParserRobot202410.toSet(A),GCollections.asSet(' ','\n')));
      $line=11;
      Object \u0393=$fix(GCollections.asSet('1'));
      $line=12;
      Object q_0=$fix(0);
      $line=13;
      Object F=$fix(GCollections.asSet(0));
      $line=14;
      Object M=$fix($invokeConstructor(GPushdownAutomaton.class,new Object[]{Q,\u03A3,\u0393,q_0,F}));
      $line=15;
      Object SkipChars=$fix(GCollections.asSet(' ','\n'));
      $line=22;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,1,$cast(java.lang.String.class,"(m")),new Object[]{"1"});
      $line=23;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(1,$opMinusY(1),$cast(java.lang.String.class,'#')),new Object[]{});
      $line=25;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,2,$cast(java.lang.String.class,"(t")),new Object[]{"1"});
      $line=26;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(2,$opMinusY(1),$cast(java.lang.String.class,"r")),new Object[]{});
      $line=27;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(2,$opMinusY(1),$cast(java.lang.String.class,"A")),new Object[]{});
      $line=29;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,3,$cast(java.lang.String.class,"(t")),new Object[]{"1"});
      $line=30;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(3,$opMinusY(1),$cast(java.lang.String.class,"d")),new Object[]{});
      $line=32;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,4,$cast(java.lang.String.class,"(p")),new Object[]{"1"});
      $line=33;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(4,1,$cast(java.lang.String.class,"o")),new Object[]{});
      $line=35;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,5,$cast(java.lang.String.class,"(h")),new Object[]{"1"});
      $line=36;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(5,6,$cast(java.lang.String.class,"I")),new Object[]{});
      $line=37;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(5,6,$cast(java.lang.String.class,"#")),new Object[]{});
      $line=38;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(6,$opMinusY(1),$cast(java.lang.String.class,"r")),new Object[]{});
      $line=39;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(6,$opMinusY(1),$cast(java.lang.String.class,"z")),new Object[]{});
      $line=41;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,7,$cast(java.lang.String.class,"(u")),new Object[]{"1"});
      $line=42;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(7,$opMinusY(2),$cast(java.lang.String.class,"r")),new Object[]{});
      $line=43;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(7,$opMinusY(2),$cast(java.lang.String.class,"z")),new Object[]{});
      $line=44;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(2),$opMinusY(2),$cast(java.lang.String.class,"r")),new Object[]{});
      $line=45;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(2),$opMinusY(2),$cast(java.lang.String.class,"z")),new Object[]{});
      $line=46;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(2),0,$cast(java.lang.String.class,")")),new Object[]{});
      $line=48;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,8,$cast(java.lang.String.class,"(a")),new Object[]{"1"});
      $line=49;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(8,9,$cast(java.lang.String.class,"I")),new Object[]{});
      $line=50;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(8,9,$cast(java.lang.String.class,"#")),new Object[]{});
      $line=51;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(9,$opMinusY(1),$cast(java.lang.String.class,"r")),new Object[]{});
      $line=52;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(9,$opMinusY(1),$cast(java.lang.String.class,"z")),new Object[]{});
      $line=54;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,$opMinusY(1),$cast(java.lang.String.class,"(l")),new Object[]{"1"});
      $line=56;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,10,$cast(java.lang.String.class,"(d")),new Object[]{"1"});
      $line=57;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,10,$cast(java.lang.String.class,"(=")),new Object[]{"1"});
      $line=58;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(10,1,$cast(java.lang.String.class,"i")),new Object[]{});
      $line=60;
      $invokeMethod("push",((gold.structures.automaton.GPushdownAutomaton)M).delta(0,11,$cast(java.lang.String.class,"(e")),new Object[]{"1"});
      $line=61;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(11,12,$cast(java.lang.String.class,"i")),new Object[]{});
      $line=62;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(12,13,$cast(java.lang.String.class,"(i")),new Object[]{});
      $line=63;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(13,13,$cast(java.lang.String.class,"i")),new Object[]{});
      $line=64;
      $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(13,0,$cast(java.lang.String.class,"i)")),new Object[]{});
      $line=72;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(1),0,$cast(java.lang.String.class,")")),new Object[]{"1"});
      $line=73;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(1),0,$cast(java.lang.String.class,"D")),new Object[]{"1","1"});
      $line=74;
      $invokeMethod("pop",((gold.structures.automaton.GPushdownAutomaton)M).delta($opMinusY(1),0,$cast(java.lang.String.class,"T")),new Object[]{"1","1","1"});
      $line=77;
      for (Object $v3:GCollections.unmodifiableCollection(Q)) {
        Object q=$v3;
        $line=78;
        for (Object $v4:GCollections.unmodifiableCollection(SkipChars)) {
          Object s=$v4;
          $line=79;
          $invokeMethod("ignore",((gold.structures.automaton.GPushdownAutomaton)M).delta(q,q,$cast(java.lang.String.class,$opAdditY("",s))),new Object[]{});
        }
      }
      $line=84;
      $result=M;
      if (true) break $try;
      $line=85;
      $rethrow(new RuntimeException("The function \"createParser(A:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ParserRobot202410.class,"createParser",$line);
    }
    return $cast(IPushdownAutomaton.class,$result);
  }
}
