class Solution {
    func findComplement(_ num: Int) -> Int {
        let bitLength = Int.bitWidth - num.leadingZeroBitCount
        let bitMask = (1 << bitLength) - 1
        return (~num) & bitMask
        
    }
}