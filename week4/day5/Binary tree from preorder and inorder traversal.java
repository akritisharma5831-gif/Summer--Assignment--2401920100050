class Solution {

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return construct(preorder, inorder, 0, inorder.length - 1);
    }

    public TreeNode construct(int[] preorder,
                              int[] inorder,
                              int start,
                              int end) {

        if (start > end) {
            return null;
        }

        
        TreeNode root =
                new TreeNode(preorder[preIndex++]);

      
        int index = start;

        while (index <= end &&
               inorder[index] != root.val) {
            index++;
        }

      
        root.left =
                construct(preorder,
                          inorder,
                          start,
                          index - 1);

  
        root.right =
                construct(preorder,
                          inorder,
                          index + 1,
                          end);

        return root;
    }
}
