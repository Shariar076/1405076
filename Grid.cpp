#include <iostream>
#include <cstdlib>
#include <queue>
#include <vector>

using namespace std;

class Graph
{
	int numV, numE;
	vector <int>* vertex ;
	int *mark;
	bool colorable = true;
public:
	Graph(int n)
	{
		init(n);
	}
	~Graph()
	{
		clear();
	}
	void init(int n)
	{
		numV = n;
		numE = 0;
		mark = new int[n];
		vertex = new vector<int> [n];
		for (int i = 0; i < n; i++)
		{
			mark[i] = -1;
		}
	}
	void clear()
	{
		delete[]mark;
		for (int i = 0; i < numV; i++)vertex[i].clear();
		numE = numV = 0;
	}
	int numVertex(){ return numV; }
	bool allVisited()
	{
		for (int i = 0; i < numV; i++)
		{
			if (mark[i] == -1)return false;
		}
		return true;
	}
	int getVertex() //get first unvisited node
	{
		for (int i = 0; i < numV; i++)
		{
			if (mark[i] == -1)return i;
		}
		return numV;
	}
	void setEdge(int i, int j)
	{
		vertex[i].push_back(j);
		vertex[j].push_back(i);
		numE++;
	}

	bool isVisited(int v){ return mark[v] != -1; }
	void setMark(int v, int c){ mark[v] = c; }
	int getMark(int v){ return mark[v]; }
    void eraseall()
    {
        for (int i = 0; i < numV; i++)
		{
			mark[i] = -1;
		}
    }
    void print()
    {
        for(int i=0;i<numV;i++)
        {
            cout<<i<<" ";
            for(int j=0;j<vertex[i].size();j++)
            {
                int a=vertex[i][j];
                cout<<a<<" ";
            }
            cout<<endl;
        }
    }
	int walk(int st,int fin)
	{
        queue<int>q;
        int cost=0;
        if(st==fin)return cost;
        q.push(st);
        setMark(st, cost);
		int v, i, c;
		while (!q.empty())
		{
			v = q.front();
			q.pop();
			cost++;
			for (int i = 0; i < vertex[v].size(); i++)
			{
				c = vertex[v][i];
				if (!isVisited(c))
				{
					setMark(c, cost);
					q.push(c);

					if(c==fin)return cost;
				}
			}
		}
		return -1;
	}
};

int main()
{

    int m,n;
    cin>>m>>n;
    char **mat=new char*[m];
    Graph gp(m*n);
    for(int i=0;i<m;i++)mat[i]=new char[n];

    for(int i=0;i<m;i++)
    {

        for(int j=0;j<n;j++)
        {

            cin>>mat[i][j];

        }
    }
    for(int i=0;i<m;i++)
    {

        for(int j=0;j<n;j++)
        {
            if(mat[i][j]=='.')
            {
                if(j<n-1 && mat[i][j+1]=='.')gp.setEdge(i*n+j,i*n+j+1);
                if(i<m-1 && mat[i+1][j]=='.')gp.setEdge(i*n+j,(i+1)*n+j);
            }
        }
    }
   // gp.print();
    int a1,b1,a2,b2,cost;
    while(cin>>a1>>b1>>a2>>b2)
    {
        cost=gp.walk((a1-1)*n+(b1-1),(a2-1)*n+(b2-1));
        if(cost==-1)cout<<"Impossible"<<endl;
        else cout<<cost<<endl;
        gp.eraseall();
    }

}
