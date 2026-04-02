class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end = False
        self.value = None  # optional


class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str, value=None) -> None:
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = TrieNode()
            node = node.children[char]
        node.is_end = True
        node.value = value if value is not None else word

    def search_node(self, word: str):
        node = self._find_node(word)
        if node and node.is_end:
            return node
        return None

    def starts_with_node(self, prefix: str):
        return self._find_node(prefix)

    def find_children(self, prefix: str, limit=None):
        """
        Returns all words under a prefix.
        If limit is set, returns up to 'limit' results.
        """
        results = []

        start_node = self._find_node(prefix)
        if not start_node:
            return results

        def dfs(node, path):
            if limit is not None and len(results) >= limit:
                return

            if node.is_end:
                results.append(path)

            for char, child in node.children.items():
                dfs(child, path + char)

        dfs(start_node, prefix)
        return results

    def _find_node(self, prefix: str):
        node = self.root
        for char in prefix:
            if char not in node.children:
                return None
            node = node.children[char]
        return node