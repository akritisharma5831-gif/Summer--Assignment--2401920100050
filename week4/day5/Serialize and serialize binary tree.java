import java.util.*;

public class Codec {
    public String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        helper(root, sb);

        return sb.toString();
    }

    public void helper(TreeNode root,
                       StringBuilder sb) {

        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");

        helper(root.left, sb);

        helper(root.right, sb);
    }


    
    public TreeNode deserialize(String data) {

        Queue<String> queue =
                new LinkedList<>(
                        Arrays.asList(data.split(",")));

        return build(queue);
    }

    public TreeNode build(
            Queue<String> queue) {

        String value = queue.poll();

        if (value.equals("null")) {
            return null;
        }

        TreeNode root =
                new TreeNode(
                        Integer.parseInt(value));

        root.left = build(queue);

        root.right = build(queue);

        return root;
    }
}
