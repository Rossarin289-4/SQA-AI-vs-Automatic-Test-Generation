import java.util.*;
public final class SimulatedAnnealingSelector {
  static double score(BitSet x,double[] w){double s=0; for(int i=x.nextSetBit(0);i>=0;i=x.nextSetBit(i+1))s+=w[i]; return s;}
  public static int[] select(double[] weights,int suiteSize,long seed,int iterations,double t0,double cooling){
    int n=weights.length,k=Math.min(Math.max(1,suiteSize),n); Random r=new Random(seed); BitSet cur=new BitSet(n); while(cur.cardinality()<k)cur.set(r.nextInt(n));
    BitSet best=(BitSet)cur.clone(); double cs=score(cur,weights),bs=cs,t=t0;
    for(int it=0;it<iterations;it++){BitSet next=(BitSet)cur.clone(); int out; do{out=r.nextInt(n);}while(!next.get(out)); int in; do{in=r.nextInt(n);}while(next.get(in)); next.clear(out);next.set(in);double ns=score(next,weights),d=ns-cs; if(d>=0||r.nextDouble()<Math.exp(d/Math.max(t,1e-12))){cur=next;cs=ns;if(cs>bs){best=(BitSet)cur.clone();bs=cs;}} t*=cooling;}
    return best.stream().toArray();}
  public static void main(String[] a){int n=Integer.parseInt(a[0]),k=Integer.parseInt(a[1]);long seed=Long.parseLong(a[2]);double[] w=new double[n];Arrays.fill(w,1);System.out.println(Arrays.toString(select(w,k,seed,5000,10,.995)));}
}
