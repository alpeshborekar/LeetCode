class Solution {
    public String capitalizeTitle(String title) {

        String[] arr = title.split(" ");

        for(int i = 0; i < arr.length; i++) {

            arr[i] = arr[i].toLowerCase();

            if(arr[i].length() > 2) {
                char[] chars = arr[i].toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                arr[i] = new String(chars);
            }
        }

        return String.join(" ", arr);
    }
}