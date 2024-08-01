public class ArrayOperations
{  
    public static void main(String[] args) {
            
            int[] numbers = {5, 10, 15, 20, 25, 30};
    
            System.out.println("Array elements:");
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of all elements: " + sum);
    
            int max = numbers[0];
            int min = numbers[0];
            for (int number : numbers) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
    
            reverseArray(numbers);
    
            System.out.println("Reversed array:");
            for (int number : numbers) {
                System.out.print(number+" ");
            }
        }

        public static void reverseArray(int[] array) {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
    }
    
