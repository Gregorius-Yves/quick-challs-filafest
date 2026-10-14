from itertools import cycle

def encrypt(plaintext, key):
    result = []
    for p, k in zip(plaintext, cycle(key)):
        result.append(ord(p) ^ ord(k))
    return bytes(result).hex()

flag = open("flag.txt").read().strip()
key = "S3CR3T"

cipher = encrypt(flag, key)
print(cipher)
