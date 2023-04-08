/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    //copy form codebix
    public Node cloneGraph(Node node) {
         if(node == null) return null;
        //creating map to make as visited node
          Map<Node, Node> map = new HashMap<>();
        //make a queue
          Queue<Node> queue = new ArrayDeque<>();
    //initially add the node in the queue
    queue.add(node);
        //making key value pair
    map.put(node, new Node(node.val, new ArrayList<>()));
        //when queue is not empty
    while (!queue.isEmpty()) {
        //delete the node from the queue and store it in temp
        Node temp = queue.poll();
        //explore all the neighbours which is stored in the queue
        for (Node neighbor : temp.neighbors) {
            //if negihbour is not present in the map 
            if (!map.containsKey(neighbor)) {
                //then add the node in map
                map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                //also add in the queue
                queue.add(neighbor);
            }
            map.get(temp).neighbors.add(map.get(neighbor));
        }
    }
 
    return map.get(node);
    }
}