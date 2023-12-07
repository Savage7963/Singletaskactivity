# Singletaskactivity
## Android activity and its Lauch modes 3rd Single-task-activity


### Single Task

In this method of operation, a new task is always generated, and a new instance is added to the task as the root one. If the activity already exists on another task, no new instance is created, and the Android system transmits the intent information via the onNewIntent() function. At any one time, there will be just one instance of the activity.

#### Syntax: <activity android:launchMode=”singleTask” />

##### Example: Assume you have activities A, B, and C, and your activity D has “launch mode = just one job ” You are about to begin an activity. D – The state of the Activity Stack before start D is A to B to C. After launching the D activity, the state of the Activity Stack is as follows: A to B to C to D (As usual, D launches here.)
 
##### Example2: Now Let suppose if we launch B that also has singleTask launch mode then current state will look like this 

                     A ->B 

                  Here old instance gets called and intent data through onNewIntent() callback. Also notice that C and D activities get destroyed here
