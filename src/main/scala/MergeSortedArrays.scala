import scala.annotation.tailrec

object MergeSortedArrays extends App {
  /**
   * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
   *
   * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
   *
   * The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
   *
   * */
  @tailrec
  def merge(arrayA: Array[Int], aSize:Int, arrayB: Array[Int], bSize: Int): Unit = if(bSize > 0) {
    if(aSize >0 && arrayA(aSize-1) >= arrayB(bSize-1)) {
      arrayA(aSize + bSize - 1) = arrayA(aSize - 1)
      merge(arrayA, aSize - 1, arrayB, bSize)
    }
    else {
      arrayA(aSize + bSize - 1) = arrayB(bSize - 1)
      merge(arrayA, aSize, arrayB, bSize - 1)
    }
  }

  val array1 = Array(1,2,3,4,0,0,0,0,0)
  val array2 = Array(3,5,6,7,9)
  println(s"array1 => ${array1.length}, ${array2.length}")
  merge(array1, 4, array2, 5)

}
