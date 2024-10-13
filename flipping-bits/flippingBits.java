public static long flippingBits(long n) {
    // The mask for a 32-bit integer (all bits set to 1)
     long mask = 0xFFFFFFFFL;  // Equivalent to 2^32 - 1 or 4294967295
     
     // Flip the bits using bitwise NOT and apply the mask to ensure 32 bits
     return (~n) & mask;

 }