from util.trie import Trie

t = Trie()

t.insert("hello");
t.insert("potato");
t.insert("pomato");
t.insert("tomato");
t.insert("toronto");
t.insert("hopper");
t.insert("high");

print (t.find_children(input()))