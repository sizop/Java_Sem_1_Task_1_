class Task_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = nums1.clone(), i = 0, j = 0, index = 0;
        while (i < m || j < n) {
            if (i < m && j < n) {
                if (temp[i] < nums2[j]) {
                    nums1[index++] = temp[i++];
                } else {
                    nums1[index++] = nums2[j++];
                }
            } else if (i == m) {
                nums1[index++] = nums2[j++];
            } else {
                nums1[index++] = temp[i++];
            }
        }
    }
}
//    Окончательный отсортированный массив не должен быть возвращен функцией,
//    а вместо этого сохранен внутри массива nums1. Чтобы учесть это, nums1
//    имеет длину m + n, где первые m элементов обозначают элементы,
//    которые должны быть объединены, а последние n элементов имеют значение 0
//    и должны игнорироваться. nums2 имеет длину n.
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]