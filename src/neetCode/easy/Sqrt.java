package neetCode.easy;


public class Sqrt {
  
  public static void main(String[] args) {
    
    System.out.println(mySqrt(12));
  }

  public static int mySqrt(int x) {
    // var i = Integer.valueOf(x);
    // return (int) Math.sqrt(i.doubleValue());
    // 下限値
    int left = 0; 
    // 上限値
    int right = x;
    // 中央値
    int mid = 0;

    // 2未満の場合は、引数をそのまま返します。
    if(x < 2) {
      return x;
    }

    // 二分木探索を開始します。
    while(left <= right) {
      // 中央値を計算します。
        mid = left + (right - left) / 2;

        // 例えば４の場合は、中間値が2でかつ平方根が2なので、答えを返返します。
        if(mid == x / mid) {
          return mid;
        }

        // 引数を中央値でわった数値が中間値より大きいの場合、下限値を中央値に近づけたいので
        if(x / mid > mid) {
          left = mid+1;
        }

        // 引数を中央値でわった数値が中間値より小さい場合かつ
        // 中間値から1をひいた数が、引数を(中央値-1)でわった数値よりも低い場合
        // つまり下限値 上限値で一致した場合は、現在の中央値で引数が割り切れるので、中央値から1をひいた数を答えとして返します。
        if(mid > x / mid && x / (mid - 1) > (mid - 1) ) {
          return mid-1;
        }

        // 引数を中央値でわった数値が中間値より小さい場合、上限値を中央値に近づけたいので、
        // 中央値から1をひいた数値をrightに代入します。
        if(mid > x / mid) {
          right = mid-1;
        }
    }
    return mid;
  }
}
