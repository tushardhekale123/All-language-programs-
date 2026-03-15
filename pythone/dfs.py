def dfs(graph, node, visited=None):
    if visited is None:
        visited = set()

    visited.add(node)
    print(node, end=" ")

    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(graph, neighbor, visited) 


# Graph
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'D': [],
    'E': ['F'],
    'F': []
}


dfs(graph, 'A'  , None)