from collections import deque
from tree import TreeNode as Node

def build_tree(arr):
    if not arr:
        return None

    root = Node(arr[0])
    queue = deque([root])
    i = 1

    while queue and i < len(arr):
        current = queue.popleft()

        if i < len(arr):
            current.left = Node(arr[i])
            queue.append(current.left)
            i += 1

        if i < len(arr):
            current.right = Node(arr[i])
            queue.append(current.right)
            i += 1

    return root

def invert_tree(root):
    if not root:
        return None

    root.left, root.right = root.right, root.left

    invert_tree(root.left)
    invert_tree(root.right)

    return root

def tree_to_array(root):
    if not root:
        return[]

    result = []
    queue = deque([root])

    while queue:
        node = queue.popleft()
        result.append(node.val)
        
        if node.left:
            queue.append(node.left)

        if node.right:
            queue.append(node.right)

    return result

print(tree_to_array(invert_tree(build_tree([4, 2, 7, 1, 3, 6, 9]))))