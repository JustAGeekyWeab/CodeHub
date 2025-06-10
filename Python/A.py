import platform
import psutil
import socket

print("Hello. This will get some files")


# https://docs.python.org/3/library/platform.html

def get_system_info():
    print("==== SYSTEM INFORMATION ====")


    print(f"System: {platform.system()}")
    print(f"Node Name: {platform.node()}")
    print(f"Release: {platform.release()}")
    print(f"Version: {platform.version()}")
    print(f"Machine: {platform.machine()}")
    print(f"Processor: {platform.processor()}")

    print("\n==== CPU ====")
    print(f"Physical cores: {psutil.cpu_count(logical=False)}")
    print(f"Total cores: {psutil.cpu_count(logical=True)}")
    print(f"CPU Usage: {psutil.cpu_percent(interval=1)}%")

    print("\n==== MEMORY ====")
    mem = psutil.virtual_memory()
    print(f"Total: {round(mem.total / (1024 ** 3), 2)} GB")
    print(f"Used: {round(mem.used / (1024 ** 3), 2)} GB")
    print(f"Available: {round(mem.available / (1024 ** 3), 2)} GB")

    print("\n==== DISK ====")
    disk = psutil.disk_usage('/')
    print(f"Total: {round(disk.total / (1024 ** 3), 2)} GB")
    print(f"Used: {round(disk.used / (1024 ** 3), 2)} GB")
    print(f"Free: {round(disk.free / (1024 ** 3), 2)} GB")

    print("\n==== NETWORK ====")
    hostname = socket.gethostname()
    ip_address = socket.gethostbyname(hostname)
    print(f"Hostname: {hostname}")
    print(f"IP Address: {ip_address}")

    print("\n==== OTHER ====")
    print(f"Machine: {platform.machine()}")
    print(f"Release: {platform.release()}")
    print("Without f Release: {platform.release()}")
    #print(f"Architecture: {platform.architecture(executable=sys.executable, bits='', linkage='')}")# sys is not defined
    print(f"Node: {platform.node()}")
    print(f"Platform: {platform.platform(aliased=False, terse=False)}")
    print(f"Py Build: {platform.python_build()}")
    print(f"Py Compiler: {platform.python_compiler()}")
    print(f"Py Branch: {platform.python_branch()}")
    print(f"Py Implementation: {platform.python_implementation()}")
    print(f"Py Revision: {platform.python_revision()}")
    print(f"Py Version: {platform.python_version()}")

if __name__ == "__main__":
    get_system_info()