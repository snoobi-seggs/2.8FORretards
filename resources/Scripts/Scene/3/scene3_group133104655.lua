local L0_1, L1_1, L2_1, L3_1, L4_1, L5_1, L6_1, L7_1
L0_1 = {}
L0_1.group_id = 133104655
L1_1 = {}
L2_1 = {}
L2_1.config_id = 655001
L2_1.monster_id = 21020301
L3_1 = {}
L3_1.x = 293.477
L3_1.y = 195.669
L3_1.z = 863.526
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 139.49
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 19
L2_1.drop_tag = "\228\184\152\228\184\152\230\154\180\229\190\146"
L2_1.disableWander = true
L2_1.oneoff_reset_version = 2
L2_1.area_id = 6
L3_1 = {}
L3_1.config_id = 655004
L3_1.monster_id = 21030201
L4_1 = {}
L4_1.x = 300.531
L4_1.y = 195.957
L4_1.z = 858.934
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 238.646
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 19
L3_1.drop_tag = "\228\184\152\228\184\152\232\144\168\230\187\161"
L3_1.disableWander = true
L3_1.pose_id = 9012
L3_1.oneoff_reset_version = 2
L3_1.area_id = 6
L4_1 = {}
L4_1.config_id = 655005
L4_1.monster_id = 21010401
L5_1 = {}
L5_1.x = 310.712
L5_1.y = 203.003
L5_1.z = 858.347
L4_1.pos = L5_1
L5_1 = {}
L5_1.x = 0.0
L5_1.y = 275.436
L5_1.z = 0.0
L4_1.rot = L5_1
L4_1.level = 19
L4_1.drop_tag = "\232\191\156\231\168\139\228\184\152\228\184\152\228\186\186"
L4_1.disableWander = true
L4_1.oneoff_reset_version = 2
L4_1.area_id = 6
L5_1 = {}
L5_1.config_id = 655006
L5_1.monster_id = 21010201
L6_1 = {}
L6_1.x = 303.597
L6_1.y = 195.996
L6_1.z = 858.523
L5_1.pos = L6_1
L6_1 = {}
L6_1.x = 0.0
L6_1.y = 238.646
L6_1.z = 0.0
L5_1.rot = L6_1
L5_1.level = 19
L5_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L5_1.disableWander = true
L5_1.isOneoff = true
L5_1.pose_id = 9012
L5_1.area_id = 6
L6_1 = {}
L6_1.config_id = 655007
L6_1.monster_id = 21010201
L7_1 = {}
L7_1.x = 301.594
L7_1.y = 195.47
L7_1.z = 861.701
L6_1.pos = L7_1
L7_1 = {}
L7_1.x = 0.0
L7_1.y = 238.646
L7_1.z = 0.0
L6_1.rot = L7_1
L6_1.level = 19
L6_1.drop_tag = "\228\184\152\228\184\152\228\186\186"
L6_1.disableWander = true
L6_1.isOneoff = true
L6_1.pose_id = 9012
L6_1.area_id = 6
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
L2_1.config_id = 655002
L2_1.gadget_id = 70211022
L3_1 = {}
L3_1.x = 287.778
L3_1.y = 195.803
L3_1.z = 857.536
L2_1.pos = L3_1
L3_1 = {}
L3_1.x = 0.0
L3_1.y = 43.186
L3_1.z = 0.0
L2_1.rot = L3_1
L2_1.level = 16
L2_1.drop_tag = "\230\136\152\230\150\151\233\171\152\231\186\167\231\146\131\230\156\136"
L3_1 = GadgetState
L3_1 = L3_1.ChestLocked
L2_1.state = L3_1
L2_1.isOneoff = true
L2_1.persistent = true
L3_1 = {}
L3_1.name = "chest"
L3_1.exp = 1
L2_1.explore = L3_1
L2_1.area_id = 6
L3_1 = {}
L3_1.config_id = 655009
L3_1.gadget_id = 70220035
L4_1 = {}
L4_1.x = 296.008
L4_1.y = 196.059
L4_1.z = 859.642
L3_1.pos = L4_1
L4_1 = {}
L4_1.x = 0.0
L4_1.y = 106.687
L4_1.z = 0.0
L3_1.rot = L4_1
L3_1.level = 19
L3_1.isOneoff = true
L3_1.area_id = 6
L1_1[1] = L2_1
L1_1[2] = L3_1
gadgets = L1_1
L1_1 = {}
regions = L1_1
L1_1 = {}
L2_1 = {}
L2_1.config_id = 1655003
L2_1.name = "ANY_MONSTER_DIE_655003"
L3_1 = EventType
L3_1 = L3_1.EVENT_ANY_MONSTER_DIE
L2_1.event = L3_1
L2_1.source = ""
L2_1.condition = "condition_EVENT_ANY_MONSTER_DIE_655003"
L2_1.action = "action_EVENT_ANY_MONSTER_DIE_655003"
L3_1 = {}
L3_1.config_id = 1655011
L3_1.name = "MONSTER_BATTLE_655011"
L4_1 = EventType
L4_1 = L4_1.EVENT_MONSTER_BATTLE
L3_1.event = L4_1
L3_1.source = ""
L3_1.condition = "condition_EVENT_MONSTER_BATTLE_655011"
L3_1.action = "action_EVENT_MONSTER_BATTLE_655011"
L1_1[1] = L2_1
L1_1[2] = L3_1
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
L4_1 = 655004
L5_1 = 655006
L6_1 = 655007
L3_1[1] = L4_1
L3_1[2] = L5_1
L3_1[3] = L6_1
L2_1.monsters = L3_1
L3_1 = {}
L4_1 = 655002
L5_1 = 655009
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.gadgets = L3_1
L3_1 = {}
L2_1.regions = L3_1
L3_1 = {}
L4_1 = "ANY_MONSTER_DIE_655003"
L5_1 = "MONSTER_BATTLE_655011"
L3_1[1] = L4_1
L3_1[2] = L5_1
L2_1.triggers = L3_1
L2_1.rand_weight = 100
L3_1 = {}
L4_1 = {}
L5_1 = 655001
L6_1 = 655005
L4_1[1] = L5_1
L4_1[2] = L6_1
L3_1.monsters = L4_1
L4_1 = {}
L3_1.gadgets = L4_1
L4_1 = {}
L3_1.regions = L4_1
L4_1 = {}
L3_1.triggers = L4_1
L3_1.rand_weight = 100
L1_1[1] = L2_1
L1_1[2] = L3_1
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
condition_EVENT_ANY_MONSTER_DIE_655003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2, L6_2
  L2_2 = ScriptLib
  L2_2 = L2_2.SetGadgetStateByConfigId
  L3_2 = A0_2
  L4_2 = 655002
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
action_EVENT_ANY_MONSTER_DIE_655003 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2
  L2_2 = A1_2.param1
  if 655004 ~= L2_2 then
    L2_2 = false
    return L2_2
  end
  L2_2 = true
  return L2_2
end
condition_EVENT_MONSTER_BATTLE_655011 = L1_1
function L1_1(A0_2, A1_2)
  local L2_2, L3_2, L4_2, L5_2
  L2_2 = ScriptLib
  L2_2 = L2_2.AddExtraGroupSuite
  L3_2 = A0_2
  L4_2 = 133104655
  L5_2 = 2
  L2_2(L3_2, L4_2, L5_2)
  L2_2 = 0
  return L2_2
end
action_EVENT_MONSTER_BATTLE_655011 = L1_1