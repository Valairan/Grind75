from tree import TreeNode as Node
from invertbinarytree import build_tree


def max_depth(node):
    if not node:
        return 0

    return 1 + max(max_depth(node.left), max_depth(node.right))

print(max_depth(build_tree([3,9,20,None,None,15,7])))