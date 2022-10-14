#include<stdio.h>
#include<malloc.h>
struct node
{
	int info;
	struct node *next;
}*start=NULL;
main()
{
	int ch,i;
	clrscr();
	while(1)
	{
		printf("\n1 Create List");
		printf("\n2 Insert at beginning");
		printf("\n3 Insert at Last Position");
		printf("\n4 Insert before a given location");
		printf("\n5 Insert after a given location");
		printf("\n6 Delete");
		printf("\n7 Search");
		printf("\n8 Print");
		printf("\n9 Quit");
		printf("\nEnter your choice= ");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				create();
				break;
			case 2:
				insertbeg();
				break;
			case 3:
				insertlast();
				break;
			case 4:
				insertbefore();
				break;
			case 5:
				insertafter();
				break;
			case 6:
				del();
				break;
			case 7:
				search();
				break;
			case 8:
				print();
				break;
			case 9:
				exit();
			default:
				printf("Wrong choice\n");
		}
	}
}
create()
{
	struct node *temp,*ptr;
	char ch='y';
	int item;
	clrscr();
	printf("\n\t\t****INPUT BLOCK****\n");
	if(start!=NULL)
	{
		printf("\n\n\t****LIST IS ALREADY EXIST****");
		return;
	}
	fflush(stdin);
	while(ch=='y')
	{
		temp=(struct node*)malloc(sizeof(struct node));
		printf("\n\t Enter the no:==> ");
		scanf("%d",&item);
		temp->info=item;
		temp->next=NULL;
		if(start==NULL)
			ptr=start=temp;
		else
		{
			ptr->next=temp;
			ptr=ptr->next;
		}
		fflush(stdin);
		printf("\t Do you want to continue (y/n)?: ");
		ch=getchar();
	}
}
insertbeg()
{
	struct node *temp;
	int item;
	printf("Enter the item to be inserted= ");
	scanf("%d",&item);
	temp=(struct node*)malloc(sizeof(struct node));
	temp->info=item;
	temp->next=start;
	start=temp;
}
insertlast()
{
	struct node *temp,*ptr;
	int item;
	printf("Enter the item to be inserted= ");
	scanf("%d",&item);
	temp=(struct node*)malloc(sizeof(struct node));
	temp->info=item;
	temp->next=NULL;
	ptr=start;
	while(ptr->next!=NULL)
	{
		ptr=ptr->next;
	}
	ptr->next=temp;
}
insertafter()
{
	struct node *temp,*ptr;
	int i,item,pos;
	printf("Enter the element: ");
	scanf("%d",&item);
	printf("Enter the position after which this element is inserted= ");
	scanf("%d",&pos);
	ptr=start;
	for(i=0;i<pos;i++)
	{
		ptr=ptr->next;
		if(ptr==NULL)
		{
			printf("position %d not available",pos);
			return;
		}
	}
	temp=(struct node*)malloc(sizeof(struct node));
	temp->next=ptr->next;
	temp->info=item;
	ptr->next=temp;
}
del(int data)
{
	struct node *temp,*ptr;
	int item;
	if(start==NULL)
	{
		printf("List is empty\n");
		return;
	}
	printf("Enter the element for deletion= ");
	scanf("%d",&item);
	if((start->info==item)&&(start->next==NULL))
	{
		temp=start;
		printf("Deleted item is =%d",temp->info);
		free(temp);
		start=NULL;
		return;
	}
	if(start->info==item)
	{
		temp=start;
		printf("Deleted item is =%d",temp->info);
		start=start->next;
		free(temp);
		return;
	}
	for(ptr=start;ptr->next->next!=NULL;ptr=ptr->next)
	{
		if(ptr->next->info==item)
		{
			temp=ptr->next;
			printf("Deleted item is =%d",temp->info);
			ptr->next=temp->next;
			free(temp);
			return;
		}
	}
	if(ptr->next->info==item)
	{
		temp=ptr->next;
		free(temp);
		ptr->next=NULL;
		return;
	}
	printf("Item %d doesnot exists in the list\n",item);
}
print()
{
	struct node *ptr;
	if(start==NULL)
	{
		printf("List is empty\n");
		return;
	}
	printf("\nLinklist contents are ");
	for(ptr=start;ptr!=NULL;ptr=ptr->next)
	{
		printf("%d",ptr->info);
	}
}
search()
{
	struct node *ptr;
	int loc=1,item;
	printf("Enter the element to be searched: ");
	scanf("%d",&item);
	for(ptr=start;ptr!=NULL;ptr=ptr->next)
	{
		if(ptr->info==item)
		{
			printf("Item %d found at position %d\n",item,loc);
			return;
		}
		loc++;
	}
	if(ptr==NULL)
	{
		printf("Item %d not found in list\n",item);
		return;
	}
}
insertbefore()
{
	struct node *temp,*ptr;
	int i,item,pos;
	printf("Enter the element= ");
	scanf("%d",&item);
	printf("Enter the position before which this element is inserted: ");
	scanf("%d",&pos);
	ptr=start;
	for(i=0;i<pos-2;i++)
	{
		ptr=ptr->next;
		if(ptr==NULL)
		{
			printf("position %d not available ",pos);
			return;
		}
	}
	temp=malloc(sizeof(struct node));
	temp->next=ptr->next;
	temp->info=item;
	ptr->next=temp;
}