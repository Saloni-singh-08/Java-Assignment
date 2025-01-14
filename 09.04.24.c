#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *left;
    struct node *right;
};

struct node*createnode(int n)
{
    struct node *p=(struct node*)malloc(sizeof(struct node));
    p->data=n;
    p->left=NULL;
    p->right=NULL;
    return p;
      }


    void preorder(struct node*root){
        if(root!=NULL)
        {
            printf("%d",root->data);
            preorder(root->left);
            preorder(root->right);
        }
    }

    void inorder(struct node*root){
        if(root!=NULL)
        {
            inorder(root->left);
            printf("%d",root->data);
            inorder(root->right);
        }
    }

void postorder(struct node*root){
        if(root!=NULL)
        {
            postorder(root->left);
            postorder(root->right);
            printf("%d",root->data);

        }
    }

    int isBST(struct node*root)
    {
        static struct node*prev=NULL;
        if(root!=NULL)
        {
            if(!isBST(root->left))
            {
                return 0;
            }

            if(prev!=NULL && root->data <=prev->data)
            {
                return 0;
            }
            prev = root;
            return isBST(root->right);
        }
        else{
            return 1;
        }
    }
struct node *search(struct node *root, int key)
{
        if(root==NULL)
        {
            return NULL;
        }
        if(root->data==key)
        {
            return root;
        }
        else if(root->data>key)
        {
           return search(root->left,key);
        }
        else
        {
           return search(root->right,key);
        }
}

int main()
{
    struct node*n=createnode(5);
    struct node*n1=createnode(3);
    struct node*n2=createnode(6);
    struct node*n3=createnode(1);
    struct node*n4=createnode(4);

    n->left=n1;
    n->right=n2;
    n1->left=n3;
    n1->right=n4;


    struct node* O = search(n,7);
    if(n!=NULL)
    {
        printf("Found : %d",O->data);
    }
    else
    {
        printf("Element not found\n");

    }


    return 0;
}
