local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1, L8_1, L9_1, L10_1, L11_1, L12_1, L13_1, L14_1, L15_1
L0_1 = require
L1_1 = "Actor/ActorCommon"
L0_1(L1_1)
L0_1 = require
L1_1 = "Actor/Npc/Config/NpcConfigCommon"
L0_1 = L0_1(L1_1)
L1_1 = L0_1.VoicePattern
L2_1 = L0_1.TalkMode
L3_1 = L0_1.DailyCondition
L4_1 = L0_1.QuestState
L5_1 = L0_1.ActionPointType
L6_1 = L0_1.CompareOperation
L7_1 = {}
L8_1 = {}
L9_1 = {}
L10_1 = {}
L11_1 = L3_1.Day
L10_1.daily = L11_1
L9_1.condition = L10_1
L10_1 = {}
L11_1 = {}
L11_1.dialogId = 1016208600
L11_1.duration = 0
L11_1.intervalMin = 20
L11_1.intervalMax = 30
L10_1[1] = L11_1
L9_1.bubbleDatas = L10_1
L10_1 = {}
L11_1 = {}
L12_1 = L3_1.Night
L11_1.daily = L12_1
L10_1.condition = L11_1
L11_1 = {}
L12_1 = {}
L12_1.dialogId = 1016208601
L12_1.duration = 0
L12_1.intervalMin = 20
L12_1.intervalMax = 30
L11_1[1] = L12_1
L10_1.bubbleDatas = L11_1
L11_1 = {}
L12_1 = {}
L12_1.activityId = 2010
L12_1.activityCondId = 2010208
L12_1.isActivityValid = true
L13_1 = L3_1.Night
L12_1.daily = L13_1
L12_1.priority = 1
L11_1.condition = L12_1
L12_1 = {}
L13_1 = {}
L13_1.dialogId = 1016208604
L13_1.duration = 0
L13_1.intervalMin = 20
L13_1.intervalMax = 30
L12_1[1] = L13_1
L11_1.bubbleDatas = L12_1
L12_1 = {}
L13_1 = {}
L13_1.activityId = 2007
L13_1.activityCondId = 2007000
L13_1.isActivityValid = true
L14_1 = L3_1.Night
L13_1.daily = L14_1
L13_1.priority = 2
L12_1.condition = L13_1
L13_1 = {}
L14_1 = {}
L14_1.dialogId = 1016208603
L14_1.duration = 0
L14_1.intervalMin = 20
L14_1.intervalMax = 30
L13_1[1] = L14_1
L12_1.bubbleDatas = L13_1
L13_1 = {}
L14_1 = {}
L14_1.activityId = 2007
L14_1.activityCondId = 2007000
L14_1.isActivityValid = true
L15_1 = L3_1.Day
L14_1.daily = L15_1
L14_1.priority = 2
L13_1.condition = L14_1
L14_1 = {}
L13_1.bubbleDatas = L14_1
L8_1[1] = L9_1
L8_1[2] = L10_1
L8_1[3] = L11_1
L8_1[4] = L12_1
L8_1[5] = L13_1
L7_1.BubbleData = L8_1
return L7_1
