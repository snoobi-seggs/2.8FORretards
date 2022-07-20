local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1, L8_1
L0_1 = {}
L0_1.group_id = 133213210
L1_1 = {}
L2_1 = {}
L2_1.config_id = 210001
L2_1.monster_id = 25010601
L3_1 = {}
L3_1.x = -3115.935
L3_1.y = 200.963
L3_1.z = -3258.52
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 359.076
L3_1.y = 287.063
L3_1.z = 356.91
L2_1.rot = L3_1
L2_1.level = 25
L2_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L2_1.disableWander = true
L2_1.pose_id = 9002
L2_1.area_id = 12
L3_1 = {}
L3_1.config_id = 210004
L3_1.monster_id = 25030301
L4_1 = {}
L4_1.x = -3118.775
L4_1.y = 201.079
L4_1.z = -3258.587
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 2.273
L4_1.y = 78.909
L4_1.z = 2.288
L3_1.rot = L4_1
L3_1.level = 27
L3_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L3_1.pose_id = 9006
L3_1.area_id = 12
L4_1 = {}
L4_1.config_id = 210005
L4_1.monster_id = 25100201
L5_1 = {}
L5_1.x = -3126.758
L5_1.y = 201.373
L5_1.z = -3260.057
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 357.089
L5_1.y = 188.198
L5_1.z = 1.387
L4_1.rot = L5_1
L4_1.level = 27
L4_1.drop_tag = "\233\171\152\233\152\182\230\173\166\229\163\171"
L4_1.pose_id = 1002
L4_1.area_id = 12
L5_1 = {}
L5_1.config_id = 210007
L5_1.monster_id = 25080101
L6_1 = {}
L6_1.x = -3137.493
L6_1.y = 200.543
L6_1.z = -3257.011
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 3.194
L6_1.y = 25.832
L6_1.z = 359.559
L5_1.rot = L6_1
L5_1.level = 27
L5_1.drop_tag = "\230\181\170\228\186\186\230\173\166\229\163\171"
L5_1.pose_id = 1004
L5_1.area_id = 12
L6_1 = {}
L6_1.config_id = 210008
L6_1.monster_id = 25010301
L7_1 = {}
L7_1.x = -3135.496
L7_1.y = 200.793
L7_1.z = -3253.376
L6_1.pos = L7_1
L7_1 = {}
L7_1.x = 356.946
L7_1.y = 194.933
L7_1.z = 1.036
L6_1.rot = L7_1
L6_1.level = 27
L6_1.drop_tag = "\231\155\151\229\174\157\229\155\162"
L6_1.pose_id = 9006
L6_1.area_id = 12
L1_1[1] = L2_1
L1_1[2] = L3_1
L1_1[3] = L4_1
L1_1[4] = L5_1
L1_1[5] = L6_1
monsters = L1_1
L1_1 = {}
npcs = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 210002
L2_1.gadget_id = 70211002
L3_1 = {}
L3_1.x = -3118.723
L3_1.y = 200.367
L3_1.z = -3248.434
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 2.683
L3_1.y = 359.958
L3_1.z = 358.21
L2_1.rot = L3_1
L2_1.level = 26
L2_1.drop_tag = "\230\136\152\230\150\151\228\189\142\231\186\167\231\168\187\229\166\187"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 12
L3_1 = {}
L3_1.config_id = 210006
L3_1.gadget_id = 70900393
L4_1 = {}
L4_1.x = -3117.967
L4_1.y = 200.96
L4_1.z = -3257.339
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 359.958
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 27
L4_1 = GadgetState
L4_1 = L4_1.GearStart
L3_1.state = L4_1
L3_1.area_id = 12
L1_1[1] = L2_1
L1_1[2] = L3_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1210003
L2_1.name = "ANY_MONSTER_DIE_210003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_210003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_210003"
L1_1[1] = L2_1
triggers = L1_1
L1_1 = {}
variables = L1_1
L1_1 = {}
L1_1.suite = 1
L1_1.end_suite = 0
L1_1.rand_suite = false
init_config = L1_1
L1_1 = {}
L2_1 = {}
L3_1 = {}
L4_1 = 210001
L5_1 = 210004
L6_1 = 210005
L7_1 = 210007
L8_1 = 210008
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L3_1[4] = L7_1
L3_1[5] = L8_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 210002
L5_1 = 210006
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_210003"
L3_1[1] = L4_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L1_1[1] = L2_1
suites = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2
  L2_2 = ScriptLib
  L2_2 = L2_2.GetGroupMonsterCount
  L3_2 = A0_2
  L2_2 = L2_2(L3_2)
  if L2_2 ~= 0 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_ANY_MONSTER_DIE_210003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 210002
  L5_2 = GadgetState
  L5_2 = L5_2.Default
  L2_2 = L2_2(L3_2, L4_2, L5_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : set_gadget_state_by_configId"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = ScriptLib
  L2_2 = L2_2.MarkPlayerAction
  L3_2 = A0_2
  L4_2 = 4001
  L5_2 = 3
  L6_2 = 1
  L2_2 = L2_2(L3_2, L4_2, L5_2, L6_2)
  if 0 ~= L2_2 then
    L2_2 = ScriptLib
    L2_2 = L2_2.PrintContextLog
    L3_2 = A0_2
    L4_2 = "@@ LUA_WARNING : mark_playerAction"
    L2_2(L3_2, L4_2)
    L2_2 = -1
    return L2_2
  end
  L2_2 = 0
  return L2_2
end
action_EVENT_ANY_MONSTER_DIE_210003 = L1_1