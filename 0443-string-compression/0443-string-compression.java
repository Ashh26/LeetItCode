class Solution { 
    // Defines the Solution class as required by the platform (e.g., LeetCode)

    public int compress(char[] chars) { 
        // Method to compress the character array in-place and return new length

        int i = 0; 
        // Read pointer: tracks the current position while scanning the input array

        int ansIndex = 0; 
        // Write pointer: tracks where to write compressed characters in the array

        int n = chars.length; 
        // Stores the total length of the input character array

        while (i < n) { 
            // Loop until the read pointer reaches the end of the array

            int j = i + 1; 
            // Lookahead pointer to count consecutive duplicate characters

            while (j < n && chars[i] == chars[j]) { 
                // Move j forward as long as characters are the same
                j++; 
                // Increment j to continue counting duplicates
            }

            chars[ansIndex++] = chars[i]; 
            // Write the current character to the compressed array
            // Increment ansIndex after writing

            int count = j - i; 
            // Calculate how many times the current character repeats

            if (count > 1) { 
                // Only write the count if the character repeats more than once

                String cnt = Integer.toString(count); 
                // Convert the repetition count to a string (e.g., 12 → "12")

                for (char ch : cnt.toCharArray()) { 
                    // Iterate over each digit of the count

                    chars[ansIndex++] = ch; 
                    // Write each digit into the array and move write pointer
                }
            }

            i = j; 
            // Move read pointer to the next new character group
        }

        return ansIndex; 
        // Return the final length of the compressed array
    }
}
